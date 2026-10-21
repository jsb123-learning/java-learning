package Special_Test;

import java.util.Scanner;
import java.util.Random;


public class Random_Test {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        //获取随即数字
        //int a = r.nextInt();
        // （随机数字生成范围 0 ～ n-1）
        //int a = r.nextInt(100);
        //第三种写法
        //int a = r.nextInt(1,100);
        //#####################################//
        int a = r.nextInt(1,100);
        System.out.println("guess");
        num =sc.nextInt();
        while(num != a) {
            //比较提示；
            if(num < a) System.out.println("猜小了");
            else System.out.println("猜大了");
            System.out.println("再猜：");
            num = sc.nextInt();
        }
        System.out.println("恭喜你，猜对了！数字是"+ num);
    }
}
