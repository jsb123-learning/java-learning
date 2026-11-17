import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class 综合练习_查找文件 {
    public static void main(String[] args) {
        File f = new File("/home/jsb123/java-learning/test");
        ArrayList<File> result = new ArrayList<>();
        toPacket(f,result);
        result.forEach(s-> System.out.println(s));
    }
    public static  void toPacket(File f , ArrayList<File> arr){
        File files[] = f.listFiles();
        if(files != null){
            for (File file : files) {
                if(file.isFile()&&file.getName().endsWith("avi")){
                    arr.add(file);
                }else{
                    toPacket(file,arr);
                }
            }
        }
    }
}

