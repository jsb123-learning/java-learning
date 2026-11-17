import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class 编码和解码_IO {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str = "abc金神兵";
        byte b[]=str.getBytes();
        System.out.println(Arrays.toString(b));
        //GBK编码
        byte GBKb[]=str.getBytes("GBK");
        System.out.println(Arrays.toString(GBKb));
        //解码
        String result = new String(b);
        System.out.println(result);
        //GBK解码
        String GBKr= new String(GBKb,"GBK");
        System.out.println(GBKr);
    }
}
