import java.io.*;
import java.nio.charset.Charset;

public class 编码转换_转换流 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr =  new InputStreamReader(new FileInputStream("test/gbk_mojibake.txt"),"GBK");
        int len ;
        while ((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        isr.close();*/
        FileReader fr = new FileReader("test/gbk_mojibake.txt", Charset.forName("GBK"));
        int len ;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        fr.close();
    }
}
