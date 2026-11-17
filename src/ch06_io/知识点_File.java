import While_demo.复利计算器;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class 知识点_File {
    public static void main(String[] args) {
        String name = "~/test.txt";
        File f1 = new File(name);
        System.out.println(f1);
        //父级路径:~/
        //子级路径：test.txt
        String father = "~/";
        String child = "test.txt";
        //拼接
        File f2 = new File(father,child);
        System.out.println(f2);
        //创建
        File javaTest=  new File("/home/jsb123/java-learning/test");
        File test = new File(javaTest.getName());
        long time =javaTest.lastModified();
        Instant ins =  Instant.ofEpochMilli(time);
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy年MM月dd日：HH时mm分ss秒");
        System.out.println(ins.atZone(ZoneId.of("Asia/Shanghai")).format(date));
    }
}
