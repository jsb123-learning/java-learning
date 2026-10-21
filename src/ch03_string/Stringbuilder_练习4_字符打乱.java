import java.util.Random;

public class Stringbuilder_练习4_字符打乱 {
    public static void main(String[] args) {
        String str = "12345678abcdefg";
        //打乱
        Random r = new Random();
        //将字符串转换成数组
        char a[] =str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            char tmp =0;
            int gide = r.nextInt(a.length);
            tmp=a[i];
            a[i]=a[gide];
            a[gide]=tmp;
        }
        //转换
        str = new String(a);
        System.out.println(str);
        System.out.println(str.length());

    }
}
