#!/usr/bin/env bash
# jswitch.sh —— 在 JDK 8 / 17 之间切换，不需要 sudo
#
# 用法（由 ~/.bashrc 自动 source，直接在终端敲）:
#   jswitch          # 看当前用的是哪个 JDK
#   jswitch 17       # 切到 JDK 17
#   jswitch 8        # 切到 JDK 8
#
# 也可以手动加载:  source scripts/jswitch.sh

jswitch() {
  local ver="${1:-}"
  local jvm_root="/usr/lib/jvm"
  local target=""

  case "$ver" in
    8|1.8) target="$jvm_root/java-8-openjdk-amd64" ;;
    17)    target="$jvm_root/java-17-openjdk-amd64" ;;
    ""|status)
      echo "当前 JDK : $(java -version 2>&1 | head -1)"
      echo "JAVA_HOME: ${JAVA_HOME:-<未设置>}"
      echo
      echo "本机可用:"
      for d in "$jvm_root"/java-8-openjdk-amd64 "$jvm_root"/java-17-openjdk-amd64; do
        [ -d "$d" ] && echo "  ✓ $(basename "$d")"
      done
      echo
      echo "用法: jswitch 8 | jswitch 17"
      return 0
      ;;
    *)
      echo "✗ 只支持 8 或 17（收到: $ver）"
      return 1
      ;;
  esac

  if [ ! -d "$target" ]; then
    echo "✗ 找不到 $target"
    echo "  先装: sudo apt install -y openjdk-8-jdk openjdk-17-jdk"
    return 1
  fi

  # 先把旧的 /usr/lib/jvm/*/bin 从 PATH 摘掉，否则切来切去 PATH 会越堆越长
  PATH="$(printf '%s' "$PATH" | tr ':' '\n' | grep -v '^/usr/lib/jvm/' | paste -sd: -)"
  export PATH="$target/bin:$PATH"
  export JAVA_HOME="$target"

  echo "✓ 已切到 JDK $ver"
  java -version 2>&1 | head -1
  echo "  JAVA_HOME=$JAVA_HOME"
}
