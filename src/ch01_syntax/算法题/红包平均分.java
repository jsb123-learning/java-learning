package 算法题;

import java.util.Random;
import java.util.Scanner;

public class 红包平均分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int sum=0;
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0;i<n-1;i++){
            //m-sum 剩下的钱
            //n-i 剩下的份数
            int num=r.nextInt((m-sum)/(n-i))+1;
            sum+=num;
            System.out.println("你分到了："+num);
        }
        System.out.println("你分到了："+(m-sum));


    }
}
