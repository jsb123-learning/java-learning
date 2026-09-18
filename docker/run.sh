#!/usr/bin/env bash
# run.sh —— 用容器里的「纯净 JDK 8」编译并运行
#
# 用途: 验证你的代码不依赖本机环境。本机装了一堆东西时，
#       某些代码可能「只有你机器上能跑」，用这个脚本能查出来。
#
# 用法:
#   ./docker/run.sh src/ch01_syntax/Hello.java
#   ./docker/run.sh src/ch01_syntax/Hello.java 张三 18
#
# 注意: 代码目录是只读挂载进去的，容器里没有任何额外依赖。

set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
IMG="eclipse-temurin:8-jdk"

if [ $# -lt 1 ]; then
  echo "用法: $0 <文件路径> [程序参数...]"
  exit 1
fi

SRC="$1"; shift
[ -f "$SRC" ] || SRC="$ROOT/$SRC"
if [ ! -f "$SRC" ]; then
  echo "✗ 找不到文件: $SRC"
  exit 1
fi

REL="${SRC#"$ROOT"/}"
CLASS="$(basename "$REL" .java)"
PKG="$(grep -m1 -E '^[[:space:]]*package[[:space:]]' "$SRC" 2>/dev/null \
        | sed -E 's/^[[:space:]]*package[[:space:]]+//; s/;.*$//' \
        | tr -d '[:space:]' || true)"
MAIN="$CLASS"
[ -n "$PKG" ] && MAIN="$PKG.$CLASS"

if ! docker image inspect "$IMG" >/dev/null 2>&1; then
  echo "✗ 本机没有 $IMG 镜像"
  echo "  拉取: docker pull $IMG"
  exit 1
fi

# 注意: 不能用 ARGS="$(printf '%q ' "$@")" —— 无参数时 printf 会吐出一个空串，
# 结果程序会收到一个空参数而不是「没有参数」。所以这里要判空。
ARG_STR=""
if [ $# -gt 0 ]; then
  ARG_STR="$(printf '%q ' "$@")"
fi

echo "容器    : $IMG  (纯净 JDK 8)"
echo "文件    : $REL"
echo "────────────────────────────────────────"

docker run --rm \
  -v "$ROOT":/work:ro \
  -w /work \
  -e REL="$REL" \
  -e MAIN="$MAIN" \
  -e ARGS="$ARG_STR" \
  "$IMG" \
  bash -c '
    set -e
    echo "容器内 JDK: $(java -version 2>&1 | head -1)"
    mkdir -p /tmp/out
    javac -encoding UTF-8 -d /tmp/out "$REL"
    echo "编译通过，运行中..."
    echo "────────────────────────────────────────"
    eval java -Dfile.encoding=UTF-8 -cp /tmp/out "$MAIN" $ARGS
  '
