package If_demo;

import java.util.Scanner;

public class 商品循环_优化 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入商品价格
        System.out.println("请输入商品价格：");
        double price = sc.nextDouble();
        while(price <= 0){
            System.out.println("价格不能为负数或零，请重新输入：");
            price = sc.nextDouble();
        }
        //优惠卷计算；
        double coupon = 0;
        if(price >= 200){
            coupon =price - 90;
        }else if (price >= 100){
            coupon = price -50;
        }else if (price >= 50) {
            coupon = price -30;
        }else if (price >= 10){
            coupon = price - 8;
        }else coupon = price;
        System.out.println(coupon);
        //vip价格计算；
        double vip = price * 0.8;
        //比较
        if(coupon < vip){
            System.out.println("优惠卷价格更优惠：" + coupon);
        }else if (coupon < vip){
            System.out.println("会员价格更优惠：" + vip);
        }else{
            System.out.println("价格一样：" + coupon);
        }
    }
}
