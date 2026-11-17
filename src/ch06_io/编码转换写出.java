import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class 编码转换写出 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test/gbk_mojibakebak.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
    }
}
