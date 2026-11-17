import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 字节流读入数据_FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test/notes.txt");
        //读取数据
        int b;
        while((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();


    }
}
