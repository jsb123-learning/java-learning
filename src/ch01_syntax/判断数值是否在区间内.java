import java.util.Scanner;

public class 判断数值是否在区间内 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入一个数；
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        //判断该数是否在0到100之间；
        System.out.println("该数是否在0到100之间：" + (num > 0 && num < 100));
        //判断该数是否不在0到100之间；
        System.out.println("该数是否不在0到100之间：" + (num < 0 || num > 100));
    }
}
