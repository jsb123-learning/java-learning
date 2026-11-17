import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class 文件创建删除_File {
    public static void main(String[] args) throws IOException {
        File f = new File("test/test1/");
        f.getParentFile().mkdir();
        f.createNewFile();
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        File[] files1 = File.listRoots();
        for (File file : files1) {
            System.out.println(file);
        }
        String arr[] = f.list();
        System.out.println(Arrays.toString(arr));
    }
}
