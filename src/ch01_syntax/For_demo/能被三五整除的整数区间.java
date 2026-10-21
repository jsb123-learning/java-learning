package For_demo;

import java.util.Scanner;

public class 能被三五整除的整数区间 {
    public static void main(String[] args) {
        //输入两个区间值；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个区间值：");
        int a = sc.nextInt();
        System.out.println("请输入第二个区间值：");
        int b = sc.nextInt();
        int sum = 0;
        //判断两数大小；
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }

        //开始寻找
        for (int i=a;i<=b;i++){
            if(i%3==0&&i%5==0){
                System.out.println(i);
                sum = sum + 1;
            }
        }
        System.out.println("在"+a+"到"+b+"之间，能被三五整除的整数一共有："+sum);
    }
}
