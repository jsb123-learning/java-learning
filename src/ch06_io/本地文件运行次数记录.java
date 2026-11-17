import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 本地文件运行次数记录 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test/times.txt");
        int times= fis.read();
        FileOutputStream fos = new FileOutputStream("test/times.txt");
        if(times==-1){
            System.out.println("第1次运行");
            fos.write(2);
        }else{
            fos.write(times+1);
            System.out.println("第"+times+"次运行");
        }

        fos.close();
        fis.close();
    }
}
