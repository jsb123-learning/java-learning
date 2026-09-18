#!/usr/bin/env bash
# jclean.sh —— 清空编译产物 out/
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
rm -rf "$ROOT/out"
mkdir -p "$ROOT/out"
echo "✓ 已清空 $ROOT/out"
