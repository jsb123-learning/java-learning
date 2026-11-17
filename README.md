# java-learning

Java 基础学习仓库。环境、进度、常用命令都在这一个文件里。

---

## 环境现状

| 项目 | 状态 |
|---|---|
| 操作系统 | Ubuntu 24.04 LTS |
| JDK 17 | 主力，学语法用 |
| JDK 8 | 备用，衔接后面的 SpringMVC 老栈 |
| 编辑器 | IntelliJ IDEA Community |
| Git | 已初始化 |

---

## 常用命令速查

```bash
# 编译并运行单个文件
./scripts/jrun.sh src/ch01_syntax/Hello.java

# 带参数运行
./scripts/jrun.sh src/ch01_syntax/Hello.java 张三 18

# 清空编译产物
./scripts/jclean.sh

# 查看 / 切换 JDK 版本
jswitch
jswitch 8
jswitch 17

# 用容器里的纯净 JDK 8 验证（确保代码不依赖本机环境）
./docker/run.sh src/ch01_syntax/Hello.java

# 起个常驻容器进去随便敲（退出后记得 down）
./docker/shell.sh
```

> `jswitch` 是 shell 函数，由 `~/.bashrc` 自动加载。新开的终端直接能用。

---

## 目录结构

```
java-learning/
├── src/
│   ├── ch01_syntax/       变量 / 数据类型 / 运算符 / 分支 / 循环 / 数组 / 方法
│   ├── ch02_oop/          类与对象 / 构造器 / 封装 / 继承 / 多态 / 接口 / 抽象类
│   ├── ch03_string/       String / StringBuilder / 正则 / 包装类 / 日期时间
│   ├── ch04_collection/   List / Set / Map / 泛型 / 迭代器 / Stream 入门
│   ├── ch05_exception/    异常体系 / try-catch-finally / 自定义异常
│   ├── ch06_io/           File / 字节流 / 字符流 / 序列化
│   ├── ch07_thread/       线程 / Runnable / 同步 / 线程池入门
│   └── ch99_practice/     阶段性综合练习
├── scripts/
│   ├── jrun.sh            一键编译运行
│   ├── jswitch.sh         JDK 版本切换
│   └── jclean.sh          清编译产物
├── docker/
│   ├── run.sh             容器纯净 JDK 验证（一次性）
│   ├── shell.sh           起常驻容器进去敲命令
│   ├── compose.yml        常驻容器的编排文件
│   └── README.md          为什么需要它
├── out/                   编译产物（已 gitignore）
└── README.md              本文件
```

> 目录用 `ch01_` 而不是 `01_` 前缀，因为 **Java 包名不能以数字开头**，
> 将来加 `package ch01_syntax;` 时不会报错。

---

## 学习进度

打勾表示「写完代码 + 能给别人讲明白」。

### 阶段 1 · 语法基础
- [ ] 变量、八种基本数据类型、类型转换
- [ ] 运算符（算术 / 关系 / 逻辑 / 三元 / 位）
- [ ] `if` / `switch` 分支
- [ ] `for` / `while` / `do-while` / `break` `continue`
- [ ] 数组（一维 / 二维 / 遍历 / 排序）
- [ ] 方法（定义 / 重载 / 形参实参 / 可变参数 / 递归）

### 阶段 2 · 面向对象（重头戏）
- [ ] 类与对象、成员变量 vs 局部变量
- [ ] 构造器、`this`、`static`
- [ ] 封装：访问修饰符、getter/setter
- [ ] 继承：`extends`、`super`、方法重写
- [ ] 多态：向上转型、动态绑定
- [ ] `abstract` 抽象类
- [ ] `interface` 接口
- [ ] `final`、内部类、枚举 `enum`

### 阶段 3 · 核心 API
- [ ] `String` / `StringBuilder` / `StringBuffer`
- [ ] 包装类与自动装箱拆箱
- [ ] `Object` 方法：`equals` / `hashCode` / `toString`
- [ ] 集合：`List` / `Set` / `Map` 及常用实现
- [ ] 泛型、迭代器、`Collections` 工具类
- [ ] `LocalDate` / `LocalDateTime`

### 阶段 4 · 异常与 IO
- [ ] 异常体系、`try-catch-finally`、`throws` / `throw`
- [ ] 自定义异常
- [ ] `File` 类、字节流、字符流
- [ ] 缓冲流、转换流、序列化

### 阶段 5 · 多线程
- [ ] `Thread` / `Runnable` / `Callable`
- [ ] 线程生命周期、`sleep` / `join` / `interrupt`
- [ ] `synchronized`、线程安全
- [ ] 线程池入门

### 阶段 6 · 综合练习_加密解密
- [ ] 控制台小项目（图书管理 / 学生管理 / 计算器）

---

## 关于两个 JDK 版本

**默认用 JDK 17。** 理由：基础语法 8 和 17 几乎没差别，但 `var`、`record`、
文本块、switch 表达式这些是面试会问的，SpringBoot 3 也只支持 17+。

**遇到老教程卡住时**，先试试 `jswitch 8` 再跑。跟着 JDK 8 时代写的教程走，
切回 8 能省掉一堆莫名其妙的报错。

**容器验证**：写完一段比较关键的代码，用 `./docker/run.sh` 跑一遍，
里面是纯净 JDK 8，能过就说明代码本身没问题，不是靠你本机环境撑着的。
