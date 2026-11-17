import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 写出一段文字_IO {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test/notes.txt");
        fos.write(77);
        fos.write(76);
        //续写
        FileOutputStream fos1 = new FileOutputStream("test/notes.txt",true);
        byte b[] = {97,98,99,100};
        fos1.write(b,1,3);
        //换行
        String str = "\njinllshishabi";
        byte bytes[]=str.getBytes();
        fos1.write(bytes);




    }
}
