package For_demo;

import java.util.Scanner;

public class 数列之和_翻转_牛客 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入一个数字；
        System.out.println("输入一个数字：");
        int n = sc.nextInt();
        int sum = 0 ;
        int x = 1;
        //实现数列翻转；
        for( int i=1;i<=n;i++){
            sum = sum + i * x;
            x = x * -1 ;
            }
        System.out.println(sum);
        }

    }



