package If_demo;

import java.util.Scanner;

public class 充卡赠送_if判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入充值金额；
        System.out.println("请输入充值金额：");
        double rechargeAmount = sc.nextDouble();
        while(rechargeAmount <= 0){
            System.out.println("没有白嫖，请重新输入：");
            rechargeAmount = sc.nextDouble();
        }
        //计算卡中额度；
        double cardBalance = 0;
        if(rechargeAmount >= 50000){
            cardBalance = rechargeAmount  +15000;
        }else if(rechargeAmount >= 20000){
            cardBalance = rechargeAmount  +6000;
        }else if (rechargeAmount >= 10000){
            cardBalance = rechargeAmount  +2500;
        }else if (rechargeAmount >= 5000){
            cardBalance = rechargeAmount  +1300;
        }else if (rechargeAmount >= 3000){
            cardBalance = rechargeAmount  +700;
        }else if (rechargeAmount >= 2000){
            cardBalance = rechargeAmount  +500;
        }else if (rechargeAmount >= 1000){
            cardBalance = rechargeAmount  +200;
        }else {
            cardBalance = rechargeAmount;
        }
        //输出余额；
        System.out.println("卡中余额为：" + cardBalance);
    }
}
