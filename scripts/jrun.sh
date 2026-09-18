#!/usr/bin/env bash
# jrun.sh —— 一键编译并运行单个 .java 文件
#
# 用法:
#   ./scripts/jrun.sh src/ch01_syntax/Hello.java
#   ./scripts/jrun.sh src/ch01_syntax/Hello.java 张三 18     # 传程序参数
#
# 说明: 自动识别文件里的 package 声明，不需要手动算包名。

set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
OUT="$ROOT/out"

if [ $# -lt 1 ]; then
  sed -n '2,8p' "${BASH_SOURCE[0]}" | sed 's/^# \{0,1\}//'
  exit 1
fi

SRC="$1"; shift
[ -f "$SRC" ] || SRC="$ROOT/$SRC"
if [ ! -f "$SRC" ]; then
  echo "✗ 找不到文件: $SRC"
  exit 1
fi

# 有 package 声明的话，运行时要用「全限定名」
PKG="$(grep -m1 -E '^[[:space:]]*package[[:space:]]' "$SRC" 2>/dev/null \
        | sed -E 's/^[[:space:]]*package[[:space:]]+//; s/;.*$//' \
        | tr -d '[:space:]' || true)"
CLASS="$(basename "$SRC" .java)"
MAIN="$CLASS"
[ -n "$PKG" ] && MAIN="$PKG.$CLASS"

mkdir -p "$OUT"

echo "JDK     : $(java -version 2>&1 | head -1)"
echo "源文件  : ${SRC#"$ROOT"/}"
echo "编译    : javac -encoding UTF-8 -d out"
javac -encoding UTF-8 -d "$OUT" "$SRC"

echo "运行    : java $MAIN $*"
echo "────────────────────────────────────────"
java -Dfile.encoding=UTF-8 -cp "$OUT" "$MAIN" "$@"
