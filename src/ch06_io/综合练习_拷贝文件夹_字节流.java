import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 综合练习_拷贝文件夹_字节流 {
    public static void main(String[] args)throws IOException {
        File src = new File("test");
        File dest = new File("test.bak");
        dest.mkdir();
        CopyFiles(src,dest);
    }
    public static void CopyFiles(File src ,File dest)throws IOException {
        File fileLists[] = src.listFiles();
        if(fileLists!=null){
            for (File fls : fileLists) {
                //如果是文件就拷贝进入当前目标文件夹
                if(fls.isFile()){
                    FileInputStream fis =  new FileInputStream(fls);
                    FileOutputStream fos = new FileOutputStream(new File(dest.getPath(),fls.getName()));
                    byte bytes[] = new byte[128];
                    System.out.println("1");
                    int len ;
                    while ((len=fis.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }
                    fos.close();
                    fis.close();
                }else {//如果是文件夹就创建一个
                     new File(dest.getPath(),fls.getName()).mkdir();
                    //直接调用
                    //src=当前的src+当前的文件名=fls
                    //dest=当前的dest+当前的文件名
                    System.out.println(fls);
                    System.out.println(new File(dest.getPath(),fls.getName()));
                    CopyFiles(fls, new File(dest.getPath(),fls.getName()));
                }
            }
        }
    }
}
