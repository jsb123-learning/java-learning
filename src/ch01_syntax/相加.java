import java.util.Scanner;

public class 相加 {
    public static void main(String[] args) {
        //输入第一个整数和第二个整数，再输入一个字符串，然后组成可读输出

        //调用scanner
        Scanner sc = new Scanner(System.in);

        //输入第一个整数
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        //输入第二个整数
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        //请输入第一个字符串
        System.out.println("请输入第一个字符串：");
        String str1 = sc.next();
        //输出可读内容
        System.out.println("第一个整数" + str1 + "第二个整数=" + (num1-num2));

    }
}
