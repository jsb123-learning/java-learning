public class Weixin_bianliang {
    public static void main(String[] args) {
        /*微信金额：0元
        支付宝金额：10元
        银行卡金额：20元
        问题一：请问现在一共有多少钱？
        问题二：微信收了10元红包，又发了2元，余额是多少
         */


        // 1.定义一个变量记录微信的金额
        double a = 10 ;
        // 2.定义一个变量记录支付宝的金额
        double b = 10 ;
        // 3.定义一个变量记录银行卡的金额
        double c = 20 ;
        // 4.输出全部金额
        System.out.println("全部金额：" + (b + a + c) + "元");
        // 5.输入微信余额
        //微信收了10元红包
        //本金+10=新余额
        //让变量a记录新的余额

        a = a+10;
        System.out.println("微信余额：" + a + "元");

    }
}
