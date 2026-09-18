# docker/ —— 纯净验收环境

## 这东西是干嘛的

学习阶段**不需要**每天用 Docker 跑 Java。但偶尔需要它，用途只有一个：

> **验证你的代码不依赖本机环境。**

场景举例：你本机装了 JDK 17，代码里用了 `var`，写得很爽。但你的目标技术栈是 JDK 8——
这段代码到了 JDK 8 环境直接编译不过。你自己在本机是发现不了的。

这时候用容器跑一遍，里面是**干干净净的 Temurin JDK 8**，除了 JDK 什么都没有。
能过，说明代码真的没问题。

## 三种用法

### 1. 一次性跑（最常用）

```bash
./docker/run.sh src/ch01_syntax/Hello.java
./docker/run.sh src/ch01_syntax/Hello.java 张三 18
```

编译、运行、退出，容器自动删掉，不留痕迹。

### 2. 常驻容器，进去随便敲

想随手试试某段代码、要反复编译时用这个：

```bash
./docker/shell.sh                # 起容器并直接进去
# 进去后在 /workspace 下随便 javac / java
exit                             # 退出
docker compose -f docker/compose.yml down    # 停掉
```

进去之后 `/workspace` 就是你的项目根目录，`src/` 里改的文件实时可见。

### 3. 手动管理常驻容器

```bash
docker compose -f docker/compose.yml up -d
docker compose -f docker/compose.yml exec java8 bash
docker compose -f docker/compose.yml down
```

> 没配 `restart`，**不会开机自启**，用完记得 `down`。

## 关于镜像

用的是 `eclipse-temurin:8-jdk`，你机器上已经有了（450MB），不用重新拉。
它是 Eclipse 基金会维护的 OpenJDK 官方构建，可以理解成"标准 JDK 8 的参考实现"。

## 什么时候该用它

| 场景 | 用不用 |
|---|---|
| 日常写代码、调试 | ✗ 用 IDEA，别折腾容器 |
| 交作业前最后检查一遍 | ✓ 跑一下，确保换台机器也能过 |
| 学 IO/多线程，想验证行为 | ✓ 容器环境干净，结果可复现 |
| 想验证 JDK 8 / 17 的差异 | ✓ 改 `IMG` 变量换版本对比 |

## 换 JDK 版本对比

`run.sh` 改第 15 行：

```bash
IMG="eclipse-temurin:8-jdk"    # 换成 17-jdk 或 21-jdk
```

`compose.yml` 改 `image:` 那一行同理。
