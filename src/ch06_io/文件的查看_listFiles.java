import jdk.jshell.SourceCodeAnalysis;

import java.io.File;
import java.util.Arrays;

public class 文件的查看_listFiles {
    public static void main(String[] args) {
        /*
        文件过滤器
        String arr[] = new f.list();
        arr = f.list((file , s)->{
            boolean b = s.contains("2");
            return b;
        });
        System.out.println(Arrays.toString(arr));
        */
        File f =new File("/home/jsb123/java-learning/test/test1");
        File files[] = f.listFiles();
        if (files != null) {
            for (File file : files) {
                if(file.getName().contains("txt")){
                    System.out.println(file.getName());
                }
            }
        }
        File arr[] =f.listFiles((file , s)->{
            return s.contains("txt");
        });
        for (File file : arr) {
            System.out.println(file);
        }
    }
}
