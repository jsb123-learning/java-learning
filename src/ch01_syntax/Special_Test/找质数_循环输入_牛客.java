package Special_Test;

import java.util.Scanner;

public class 找质数_循环输入_牛客 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =0;
        //输入一个大于2的整数；
        while(true){
            System.out.println("请输入一个大于2的整数：");
             num = sc.nextInt();
            if(num >= 2) break;
            System.out.println("输入有误，请重新输入");
        }
        //寻找质数；
        for(int i =2; i <= num; i++){
            if(i == num) {
                System.out.println(num + "是质数");
                break;
            }
            if(num % i == 0) {
                System.out.println(num + "不是质数");
                break;
            }

        }
    }
}
