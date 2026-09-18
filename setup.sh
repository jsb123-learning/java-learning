#!/usr/bin/env bash
# setup.sh —— 安装 JDK（这一步需要 sudo 密码，所以要你自己跑）
#
# 用法:  bash setup.sh
#
# 做完的事: 装 JDK 17 + JDK 8，把系统默认指向 17

set -euo pipefail

echo "════════════════════════════════════════"
echo " 安装 OpenJDK 17 (主力) + OpenJDK 8 (备用)"
echo " apt 源: 中科大镜像，速度没问题"
echo "════════════════════════════════════════"
echo

sudo apt update
sudo apt install -y openjdk-17-jdk openjdk-8-jdk

echo
echo "── 把系统默认 JDK 设为 17 ──"
sudo update-alternatives --set java  /usr/lib/jvm/java-17-openjdk-amd64/bin/java
sudo update-alternatives --set javac /usr/lib/jvm/java-17-openjdk-amd64/bin/javac

echo
echo "════════════════════════════════════════"
echo " 装完了，验证一下:"
echo "════════════════════════════════════════"
echo
java -version
echo
echo "两个 JDK 都在:"
ls -d /usr/lib/jvm/java-*-openjdk-amd64
echo
echo "✓ 接下来新开一个终端，或者执行 source ~/.bashrc ，就能用 jswitch 切版本了。"
