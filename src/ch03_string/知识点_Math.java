public class 知识点_Math {
    public static void main(String[] args) {
        //abs取得绝对值
        int a =-1;
        System.out.println(Math.abs(a));
        a=1;
        System.out.println(Math.abs(a));
        //ceil向上取整；
        System.out.println(Math.ceil(10.11));
        //floor向下取整；
        System.out.println(Math.floor(10.99));
        //round四舍五入;
        System.out.println(Math.round(10.49));
        System.out.println(Math.round(10.50));
        //比较整数取最大值；
        System.out.println(Math.max(10,20));
        //求a的b次冪
        System.out.println(Math.pow(2,8));
        //隐藏用法：
        //利用pow开根号
        System.out.println(Math.pow(16,0.25));
        System.out.println(Math.pow(16,-0.5));
        //开平方
        System.out.println(Math.sqrt(16));
        //开立方
        System.out.println(Math.cbrt(27));

    }
}
