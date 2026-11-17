import java.io.FileReader;
import java.io.IOException;

public class 字符流_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test/notes.bak");
        //无参数read方法
        int turns = 0;
        while ((turns = fr.read()) != -1) {
            System.out.print((char) turns);
        }
        fr.close();
        //有参数read方法
        /*char chars[] = new char[4];
        int len;
        while ((len=fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        fr.close(); */
    }
}


