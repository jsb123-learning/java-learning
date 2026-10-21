package If_demo;

import java.util.Scanner;

public class 超级无敌if循环_商品满减 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入商品的价格；
        System.out.println("请输入商品的价格");
        double price = sc.nextDouble();
        //录入会员价格；
        double vip = price * 0.8;
        int choice = 0;
        double end =0;
        //比较优惠价格并输出；
        if(price >= 200 ){
            if(price -90 < vip){
                choice =1;
                end =price - 90;
            }else if (price - 90 == vip){
                choice =3;
                end = price -90;
            }else{
                choice =2;
                end = price*0.8;
            }
        }else if (price >= 100){
            if (price - 50 < vip){
                choice =1;
                end = price - 50;
            }else if (price - 50 == vip){
                choice =3;
                end = price -50;
            }else{
                choice =2;
                end = price*0.8;
            }
        }else if (price >= 50){
            if (price - 30 < vip){
                choice =1;
                end = price - 30;
            }else if (price - 30 == vip){
                choice =3;
                end = price -30;
            }else{
                choice =2;
                end = price*0.8;
            }
        }else if(price >= 10){
            if (price-8 < vip){
                choice =1;
                end = price - 8;
            }else if (price-8 == vip){
                choice =3;
                end = price -8;
            }else{
                choice =2;
                end = price*0.8;
            }
        }else {
            choice =3;
            end = price*0.8;
        }
        if(choice == 1) System.out.println("优惠卷价格更优惠" + end);
        else if (choice == 2) System.out.println("会员价格更优惠:" + end);
        else System.out.println("价格一样" + end);

    }
}
