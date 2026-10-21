package 方法;

import java.util.Scanner;

public class 比较面积大小 {
    public static void main(String[] args) {
        //用户输入边长
        System.out.println("请输入边长：");
        System.out.println("请输入边宽：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("输入第二个长方形的长");
        System.out.println("输入第二个长方形的宽");
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(sqare(a,b) > sqare(c,d))
            System.out.println("第一个长方形的面积大");
        else if (sqare(a,b) < sqare(c,d))
            System.out.println("第二个长方形的面积大");
        else System.out.println("两个长方形的面积相等");


    }
    public static int sqare(int a,int b){
        return a*b;
    }
}
