import java.awt.datatransfer.FlavorEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件拷贝_IO {
    public static void main(String[] args) throws IOException {
        long start =System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("/home/jsb123/下载/Clash.Verge_2.5.10_amd64.deb");
        FileOutputStream fos = new FileOutputStream("test/clashvarge.bak");
        //制定一次拷贝的长度
        byte bytes[] = new byte[1024];
        int len;
        //读的到东西前返回读到的长度，读不到东西返回-1，读到的东西放在bytes[]中
        while((len= fis.read(bytes))!=-1){
            //读到多少写多少
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
