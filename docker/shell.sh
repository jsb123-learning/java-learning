#!/usr/bin/env bash
# shell.sh —— 起一个常驻 JDK 8 容器并直接进去
#
# 用法:
#   ./docker/shell.sh          # 进容器（不存在就自动起）
#   docker compose -f docker/compose.yml down    # 出来之后停掉
#
# 进去后在 /workspace 下随便敲 javac / java，环境是纯净 JDK 8。

set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
COMPOSE="$ROOT/docker/compose.yml"

if ! docker ps --format '{{.Names}}' | grep -q '^java8-study$'; then
  echo "容器没在跑，先启动..."
  docker compose -f "$COMPOSE" up -d
fi

echo "进入容器 (退出用 exit 或 Ctrl-D)"
echo "项目根目录已挂载到 /workspace"
echo "────────────────────────────────────────"
docker compose -f "$COMPOSE" exec java8 bash
