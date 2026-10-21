package 高级语法;

import java.util.Scanner;

public class 完整思路培养_空心菱形 {
    public static void main(String[] args) {
        //打印一个菱形；
        //用户输入；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菱形的行数(奇数)：");
        int line = sc.nextInt();
        if(line%2==0){
            System.out.println("请输入奇数！");
            return;
        }
        //中间数值需要用户方法与收缩，模拟绝对值；
        int mid = line/2+1;
        //
        //设置主循环，打印7行；
        for(int i=1;i<=line;i++){
            //先打印空格，设置空格数量
            int space;
            if(i<mid)
                space=mid-i;
            else
                space=i-mid;
            //空格数设置完成；
            for(int j=1;j<=space;j++)
                System.out.print(" ");
            //打印星星
            //需要打印的星星数量为line - 2*space
            //现在则需要判定，只需要打印第一个以及最后一个即可其
            //其他位置则打印空格
            for(int j=1;j<=line - 2*space;j++){
                if(j==1 || j==line-2*space)
                    System.out.print("*");
                else System.out.print(" ");
            }
                System.out.println();
        }
    }
}
