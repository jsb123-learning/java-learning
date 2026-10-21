package If_demo;

import java.util.Scanner;

public class 拼好饭拼出花 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //输入下单金额；
        System.out.println("请输入下单金额：");
        double m = sc.nextDouble();
        System.out.println("B:" + (m-(10*(int)(m/30))));
        System.out.println("A:" + (m*0.9));
        //A:全场9折；
        //B：满30-10；
        if(m*0.9 <= m-(10*(int)(m/30))) {
            if (m*0.9 == m-(10*(m/30))) {
                System.out.println("吃什么都一样");
            }else {
                System.out.println("吃A把");
            }
        }else{
            System.out.println("吃B把");
        }
        }
    }

