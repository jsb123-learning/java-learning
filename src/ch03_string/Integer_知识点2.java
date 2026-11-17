import java.math.BigInteger;

public class Integer_知识点2 {
    public static void main(String[] args) {
        //把基本数据类型变成包装类
        Integer i1 = 10;
        int i2=i1;
        //把字符串形式的整数变成int
        String str ="123";
        System.out.println(Integer.parseInt(str)*10);
        //获取二进制；
        System.out.println(Integer.toBinaryString(10));
        //获取八进制
        System.out.println(Integer.toOctalString(10));
        //获取十六进制
        System.out.println(Integer.toHexString(10));
        BigInteger bi = BigInteger.valueOf(100);
    }


}
