import java.util.Scanner;

public class 整除3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入一个三位整数；
        System.out.println("请输入一个三位整数：");
        int num =sc.nextInt();
        System.out.println(num % 3 == 0);
    }
}
