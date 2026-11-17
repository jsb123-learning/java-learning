package 综合练习_加密解密;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 综合练习_文件加密_编码解码 {
    public static void main(String[] args) throws IOException {
        String key ="19287474202938423232";
        File src = new File("test/notes.bak");
        File dest = new File("test/secrity.txt");
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos =  new FileOutputStream(dest);
        byte bytes[] = new byte[2];
        int len;
        int keys=0;
        while ((len=fis.read(bytes))!=-1){
            for (int i = 0; i < len; i++) {
                bytes[i] =(byte)(bytes[i]^key.charAt(keys%key.length()));
                keys+=3;
            }
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
