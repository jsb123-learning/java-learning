import jdk.swing.interop.SwingInterOpUtils;

public class StringBuilder_int_length {
    //测量字符的个数（字符串长度）
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123456789");
        int a = sb.length();
        System.out.println(a);
    }

}
