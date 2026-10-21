package 方法;

import java.util.Scanner;

public class sumGet {
    public static void main(String[] args) {
     //用户输入；
     Scanner sc = new Scanner(System.in);
     System.out.println("输入一个数字：");
     int a = sc.nextInt();
     System.out.println("输入另一个数字：");
     int b =sc.nextInt();
     int sum= getSum(a,b);
     System.out.println("两个数字的和是："+sum);
    }
    public static int getSum(int a ,int b) {
        int sum=a+b;
        return  sum;
    }
}
