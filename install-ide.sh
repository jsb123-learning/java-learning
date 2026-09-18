#!/usr/bin/env bash
# install-ide.sh —— 安装 IntelliJ IDEA Community（需要 sudo 密码）
#
# 用法:  bash install-ide.sh
#
# 为什么用 snap 而不是官网 tar.gz:
#   实测 download.jetbrains.com 在这台机器上只有 ~141 B/s，等于不通。
#   snap 商店可达，是当前唯一能装上的路子。
#
# 注意: 要下载约 1.5GB，按你现在的网速可能要几分钟到十几分钟。
#       中途别关，进度条不动不代表卡死。

set -euo pipefail

echo "════════════════════════════════════════"
echo " 安装 IntelliJ IDEA Community Edition"
echo " 下载量约 1.5GB，请耐心等待"
echo "════════════════════════════════════════"
echo

sudo snap install intellij-idea-community --classic

echo
echo "✓ 安装完成。启动方式:"
echo "   终端敲:  intellij-idea-community"
echo "   或应用列表里搜 IntelliJ IDEA"
echo
echo "首次启动会问是否导入设置，选 Do not import settings 即可。"
echo "JDK 选 /usr/lib/jvm/java-17-openjdk-amd64"
