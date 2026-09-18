/**
 * 你的第一个 Java 程序 —— 环境验证用
 *
 * 运行方式（在 java-learning 目录下）:
 *   ./scripts/jrun.sh src/ch01_syntax/Hello.java
 *   或者用容器验证纯净 JDK 环境:
 *   ./docker/run.sh src/ch01_syntax/Hello.java
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("JDK 版本: " + System.getProperty("java.version"));
        System.out.println("运行环境: " + System.getProperty("java.home"));
        System.out.println("文件编码: " + System.getProperty("file.encoding"));
        System.out.println("操作系统: " + System.getProperty("os.name"));

        if (args.length > 0) {
            System.out.println("收到参数: " + String.join(", ", args));
        } else {
            System.out.println("（没有传参数，试试 ./scripts/jrun.sh src/ch01_syntax/Hello.java 张三）");
        }
    }
}
