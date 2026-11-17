import javax.swing.text.StyledEditorKit;
import java.io.*;

public class 缓冲字节流 {
    public static void main(String[] args) throws IOException {
        File src = new File("/home/jsb123/下载/Clash.Verge_2.5.10_amd64.deb");
        File dest = new File("test/clashvargebak.bak");
        FileInputStream fis  =  new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        fis.transferTo(fos);
    }
}
