package If_demo;

import java.util.Scanner;

public class 商品优化_减少 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入商品的价格；
        System.out.println("请输入商品的价格：");
        double price = sc.nextDouble();
        while (price <= 0){
            System.out.println("价格不能为负数或零，请重新输入：");
            price = sc.nextDouble();
        }
        //优惠卷后少付出的钱；
        double discount = 0;
        if (price >= 200) {
            discount = 90;
        } else if (price >= 100) {
            discount = 50;
        } else if (price >= 50) {
            discount = 30;
        } else if (price >= 10) {
            discount = 8;
        } else {
            discount = 0;
        }

        if(discount > price * 0.2) {
            System.out.println("优惠卷价格更优惠,优惠共" + discount);
        }else if(discount < price * 0.2){
            System.out.println("会员价格更优惠,优惠共" + (price * 0.2));
        }else System.out.println("价格一样,优惠共" + discount);
    }

}
