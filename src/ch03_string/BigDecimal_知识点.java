import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_知识点 {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("123.456");
        BigDecimal bd1 = BigDecimal.valueOf(123.123);
        System.out.println(bd);
        System.out.println(bd1);

        //加法
        System.out.println(bd1.add(bd));

        //减法
        System.out.println(bd.subtract(bd1));

        //乘法
        System.out.println(bd.multiply(bd1));

        //除法
        System.out.println(bd.divide(bd1,5, RoundingMode.HALF_UP));

        //取余数
        System.out.println(bd.divideAndRemainder(bd1)[0]);
    }
}
