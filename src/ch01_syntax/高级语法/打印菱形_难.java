package 高级语法;

import java.util.Scanner;

public class 打印菱形_难 {
    public static void main(String[] args) {
        System.out.println("请输入一个奇数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("输入的不是奇数！");
            return;
        }
        //设置中间数字；
        int mid = n/2+1;
        //设置主循环
        for(int i=1;i<=n;i++){
            int space ;
            if(i<mid)
                space=mid-i;
            else
                space=i-mid;
            //输出空格
            for(int j=1;j<=space;j++)
                System.out.print(" ");
            for(int j=1;j<=n-2*space;j++)
                System.out.print("*");
            System.out.println();
        }



    }

}

