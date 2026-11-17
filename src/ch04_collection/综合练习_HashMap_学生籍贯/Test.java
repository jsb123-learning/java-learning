package 综合练习_HashMap_学生籍贯;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);
        Student s3 = new Student("王五", 20);
        HashMap <Student, String> hm = new HashMap<>();
        hm.put(s1, "北京");
        hm.put(s2, "上海");
        hm.put(s3, "广州");
        hm.forEach((Student key,String value)-> System.out.println(key+" "+value));
    }
}
