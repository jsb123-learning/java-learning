import java.io.File;
public class 综合练习_删除多级文件夹 {
    public static void main(String[] args) {
        File f =  new File("/home/jsb123/java-learning/test");
        //判断文件夹的子文件夹
        deleteFile(f);
    }
    public static void deleteFile(File f ){
        File files[] = f.listFiles();
        if(files==null){
            System.out.println(f.delete()+"初始");
        }else{
            for (File file : files) {
                deleteFile(file);
                }
            System.out.println(f.delete()+"末尾");
        }
        }
    }

