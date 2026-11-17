import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.zip.GZIPInputStream;

public class 综合练习_文本排序 {
    public static void main(String[] args) throws IOException {
        File f = new File("test/numChar.txt");
        FileInputStream fis = new FileInputStream(f);
        byte bytes[] = new byte[7];
        int  b;
        int i=0;
        while ((b=fis.read())!=-1){
            bytes[i]=(byte)b;
            System.out.println(bytes[i]);
            i++;
        }
        byte maxnum=0;
        fis.close();
        for ( i = 0; i < bytes.length-2; i++) {
            for(int j=0;j<bytes.length-2-i;j++){
                if(bytes[j]>bytes[j+1]){
                   maxnum=bytes[j];
                   bytes[j]=bytes[j+1];
                   bytes[j+1]=maxnum;
                }
            }
        }
        for (byte b1 : bytes) {
            System.out.println(b1);
        }
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(bytes,0,6);
        fos.close();
    }
}

