import java.math.BigInteger;

public class BigInteger_知识点 {
    public static void main(String[] args) {
        //获取对象
        BigInteger b1 = BigInteger.valueOf(100);
        BigInteger b2 = BigInteger.valueOf(3);

        //加法
        BigInteger b3 = b1 .add(b2);
        System.out.println(b3);

        //减法
        System.out.println(b1.subtract(b2));

        //乘法
        System.out.println(b1.multiply(b2));

        //除法
        System.out.println(b1.divide(b2));

        //取余数
        BigInteger arr[]= b1.divideAndRemainder(b2);
        System.out.println(arr[0]+" "+arr[1]);

        //比较是否相等
        System.out.println(b1.equals(b2));

        //次方
        System.out.println(b1.pow(3));

        //最大最小值
        System.out.println(b1.max(b2));
        System.out.println(b1.min(b2));
    }
}
