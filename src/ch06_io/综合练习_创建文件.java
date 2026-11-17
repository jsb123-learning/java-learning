import java.io.File;
import java.io.IOException;

public class 综合练习_创建文件 {
    public static void main(String[] args) throws IOException {
        File f = new File("/home/jsb123/java-learning/test/aaa");
        f.createNewFile();
        System.out.println(f.getPath());
    }
}
