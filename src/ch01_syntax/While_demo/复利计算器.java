package While_demo;

import java.util.Scanner;

public class 复利计算器 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入本金
        double money = 100000;
        int year = 0;
        //计算复利达到年限；
        while (money < 200000){
            money = money * 1.017;
            year++;
        }
        System.out.println("本金达到达到200000需要" + year + "年");

    }
}
