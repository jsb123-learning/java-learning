# Git 使用手册（java-learning 专用）

给自己看的手册。不背命令，记住**四件事**：改了什么 → 暂存 → 提交 → 能回退。
其余全是这四件事的变体。

> 当前仓库：本地 `main` 分支，**还没连远程**（没有 GitHub 备份）。
> 所有提交都只存在这台机器上，硬盘挂了就没了。第 6 节教你怎么推上去。

---

## 1. 每天的固定动作（80% 时间只用这 4 条）

```bash
git status              # 看现在什么情况（最常用，一天敲二十次）
git add .               # 把改动放进暂存区
git commit -m "feat: 学完数组排序"   # 存一个快照
git log --oneline       # 看历史快照
```

标准循环：

```bash
git status              # 1. 看有哪些文件变了
git diff                # 2.（可选）看具体改了什么，还没暂存时用
git add .               # 3. 全部暂存
git diff --staged       # 4.（可选）确认暂存的内容对不对
git commit -m "feat(ch01): 手写冒泡排序"   # 5. 提交
```

### add 的三种粒度

```bash
git add .                       # 全部改动
git add src/ch01_syntax/        # 只加某个目录
git add src/ch01_syntax/A.java  # 只加某个文件
git add -p                      # 交互式，一块一块挑着加（改得乱时救命）
```

### status 里的两栏是什么意思

```
要提交的变更：        ← 暂存区（已经在 add 了，下次 commit 会进去）
尚未暂存以备提交的变更： ← 工作区（改了但没 add）
未跟踪的文件：        ← 新文件，git 还不认识它
```

**暂存区 ≠ 提交。** `add` 只是"打包待发货"，`commit` 才是"真发货"。这是新手最容易糊的地方。

---

## 2. 提交信息怎么写

仓库里已经在用「约定式提交」，照这个格式继续：

```
类型(范围): 一句话说明
```

| 类型 | 什么时候用 |
|---|---|
| `feat` | 新增内容（新练习、新功能） |
| `fix` | 修 bug |
| `docs` | 只改文档（README、这个文件） |
| `refactor` | 重构，功能没变 |
| `chore` | 杂活：配置、脚本、目录整理 |
| `style` | 格式、空格、缩进，不影响逻辑 |

例子（本仓库真实历史）：

```
chore: 初始化 Java 基础学习仓库
refactor(docker): 把你放在 src/ 里的 compose 归位并修好挂载路径
feat(fightinggame): 加登录和用户类
fix(ch02): 修正多态示例里的类型转换错误
```

原则：
- 一句话说清「做了什么」，别写 "update"、"修改一下"、"aaa"
- 一次提交只干一件事。学数组就提交数组，别把 `ch01` 和 docker 配置混一起
- 中文没问题。想写得长就 `git commit`（不带 -m）打开编辑器写多行

---

## 3. 提交前检查（Java 项目专属坑）

学 Java 最容易把垃圾提上去。`.gitignore` 已经挡了 `out/`、`*.class`、`.idea/`，
但你还是得自己扫一眼：

```bash
git status --short     # 提交前最后一眼
```

看到下面这些**千万别提交**：

```
out/xxx.class          ← 编译产物，每次都变，提交了天天冲突
.idea/                 ← IDEA 本地配置，换机器就废
*.iml                  ← 同上
target/                ← Maven 产物（以后用 Maven 会有）
```

已经不小心 `git add` 进去了怎么办：

```bash
git restore --staged out/          # 只从暂存区拿出来，文件还在硬盘上
```

想永久挡住某类文件：编辑 `.gitignore`，加一行，例如 `*.jar`。

> 注意：`.gitignore` 只对**未跟踪**文件生效。已经提交过的文件加了 ignore 也没用，
> 得先 `git rm --cached 文件名` 把它从版本控制里摘掉。

---

## 4. 后悔药：按场景查表

这节比前面都重要。**慌了就先别乱敲 `reset --hard`。**

### 场景 A：文件改了想还原

```bash
git restore src/ch01_syntax/A.java   # 丢弃这个文件的改动（不可恢复！先想清楚）
git restore .                        # 丢弃全部未暂存的改动
```

### 场景 B：add 错了，不想提交了

```bash
git restore --staged <文件>    # 取消暂存，改动保留在工作区
git restore --staged .         # 全部取消暂存
```

（老教程写的 `git reset HEAD <文件>` 也是这个意思，能用，但新写法更好记）

### 场景 C：刚提交完发现信息写错 / 漏了文件

**只在还没 push 出去的时候可以用**（现在你没远程，随便用）：

```bash
git commit --amend -m "feat(ch01): 正确的信息"   # 改最后一条提交信息
git add 漏掉的文件 && git commit --amend --no-edit  # 把漏的文件塞进上一次提交
```

### 场景 D：提交了但想撤销（改动想留着）

```bash
git reset --soft HEAD~1    # 撤掉最后一次提交，改动回到暂存区
git reset HEAD~1           # 撤掉提交，改动回到工作区（默认 mixed）
```

### 场景 E：想删掉最近 3 次提交，彻底不要了

```bash
git reset --hard HEAD~3    # 危险！这 3 次的代码改动直接没了
```

### 场景 F：`reset --hard` 敲完就后悔了

有救。`reflog` 记录了你每一步 HEAD 移动，能捞回来：

```bash
git reflog                 # 找到 "reset" 之前那个 commit 的哈希，比如 abc1234
git reset --hard abc1234   # 回到那个状态
```

**记住这条：只要 commit 过，就几乎不会真丢。真正会丢的是没 commit 的改动。**

### 场景 G：改到一半，要切去干别的

```bash
git stash              # 把当前改动收进抽屉，工作区变干净
git stash list         # 看抽屉里有几件
git stash pop          # 拿出来，继续干
```

### 场景 H：想看某个文件以前长什么样

```bash
git log --oneline -- src/ch01_syntax/A.java   # 这个文件的修改历史
git show abc1234:src/ch01_syntax/A.java       # 看某次提交时它的内容
```

---

## 5. 分支（现在可以先不用，但得懂）

你现在的做法是**一个人一条 main 线**，学习和个人项目这样完全够用，别被"必须用分支"绑架。

分支真正有用的场景：想试一个不确定的写法，怕把能跑的代码搞坏。

```bash
git branch                     # 看有哪些分支，* 是当前
git switch -c try-stream       # 建并切到新分支
# ...随便折腾，搞坏了也不影响 main...
git switch main                # 切回 main
git merge try-stream           # 满意了，合并进 main
git branch -d try-stream       # 删掉试验分支
```

> `git switch` / `git restore` 是 git 2.23+ 的新命令，拆分自 `checkout`。
> 你的 git 2.43 支持，放心用。老教程里的 `git checkout -b`、`git checkout -- 文件` 也对。

**切换分支前必须 `git status` 是干净的**，否则 git 会拦住你（或者更糟，把改动带过去）。

---

## 6. 推到 GitHub 做备份（建议找个时间做掉）

本地仓库没有远程 = 单点故障。步骤：

### 6.1 建仓库

GitHub 上 New repository → 名字 `java-learning` → **不要**勾 "Add a README"（本地已经有了）

### 6.2 配 SSH 密钥（比 HTTPS 省事，不用每次输密码）

```bash
# 1. 生成密钥（一路回车）
ssh-keygen -t ed25519 -C "577996509@qq.com"

# 2. 打印公钥
cat ~/.ssh/id_ed25519.pub
```

复制输出，粘到 GitHub → Settings → SSH and GPG keys → New SSH key。

```bash
# 3. 测试
ssh -T git@github.com
# 成功会看到：Hi 用户名! You've successfully authenticated...
```

国内网络连 `github.com:22` 常被卡，可以在 `~/.ssh/config` 里加：

```
Host github.com
    HostName ssh.github.com
    Port 443
    User git
```

### 6.3 关联并推上去

```bash
cd ~/java-learning
git remote add origin git@github.com:你的用户名/java-learning.git
git branch -M main          # 确保分支叫 main
git push -u origin main     # -u 建立跟踪关系，以后直接 git push
```

以后日常只需要：

```bash
git push
git pull        # 换机器写了东西才需要
```

### 6.4 换机器怎么继续

```bash
git clone git@github.com:你的用户名/java-learning.git
cd java-learning
./setup.sh      # 装 jrun / jswitch 脚本（这个仓库自带的）
```

---

## 7. 常见报错速查

| 报错 | 原因 / 解决 |
|---|---|
| `fatal: not a git repository` | 不在仓库目录里，`cd ~/java-learning` |
| `Please tell me who you are` | 没配用户名邮箱，`git config --global user.name "x"` / `user.email "y"` |
| `Your local changes would be overwritten` | 切分支/pull 前有未提交改动，先 `git stash` 或 `git commit` |
| `Updates were rejected` | 远程有你本地没有的提交，先 `git pull --rebase` 再 push |
| `CONFLICT (content): Merge conflict` | 冲突，打开文件搜 `<<<<<<<`，手动留正确版本，删掉标记，再 `git add` + `git commit` |
| 中文文件名显示成 `\346\226\207` | `git config --global core.quotepath false` |
| `detached HEAD` | 不小心 checkout 到某个哈希，`git switch main` 回去 |

### 冲突长这样

```java
public class A {
<<<<<<< HEAD
    int age = 18;        // 你本地的
=======
    int age = 20;        // 远程来的
>>>>>>> origin/main
}
```

删掉三行标记（`<<<<<<<`、`=======`、`>>>>>>>`），只留你想要的那一行，保存，
然后 `git add A.java` → `git commit`。

---

## 8. 一次性配置（已经配好了，换机器时用）

```bash
# 身份（提交记录里显示的作者）
git config --global user.name "jsb123-learning"
git config --global user.email "577996509@qq.com"

# 中文文件名不乱码
git config --global core.quotepath false

# 默认分支叫 main
git config --global init.defaultBranch main

# 换行符处理（Linux 上不需要，但如果和 Windows 机器协作要开）
git config --global core.autocrlf input
```

查看当前所有配置：

```bash
git config --list
```

---

## 9. 命令速查总表

| 目的 | 命令 |
|---|---|
| 看状态 | `git status` / `git status --short` |
| 看改动 | `git diff`（未暂存）/ `git diff --staged`（已暂存） |
| 暂存 | `git add .` / `git add 文件` / `git add -p` |
| 提交 | `git commit -m "feat: xxx"` |
| 看历史 | `git log --oneline` / `git log --oneline --graph --all` |
| 看某次改了什么 | `git show abc1234` |
| 取消暂存 | `git restore --staged 文件` |
| 丢弃改动 | `git restore 文件` |
| 改最后一次提交 | `git commit --amend` |
| 撤销提交（留改动） | `git reset --soft HEAD~1` |
| 撤销提交（丢改动） | `git reset --hard HEAD~1` |
| 救命 | `git reflog` |
| 存/取半成品 | `git stash` / `git stash pop` |
| 分支 | `git switch -c 名字` / `git switch main` / `git merge 名字` |
| 远程 | `git remote -v` / `git push` / `git pull` |

---

## 10. 一句话原则

1. **勤提交。** 每写完一个能跑的练习就提交一次，宁可碎不要大。
2. **提交前 `git status`。** 这一条能省掉 90% 的烂摊子。
3. **没 commit 的改动才会真丢。** commit 过的都能用 `reflog` 捞回来。
4. **`reset --hard` 和 `restore` 前先想 3 秒**，这两个是真正会毁东西的。
5. **一个人学习不用折腾分支**，一条 main 线干干净净最好。
