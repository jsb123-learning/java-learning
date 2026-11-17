package 综合练习_TreeSet_对象排序;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("c",1);
        Student s1 = new Student("ab",2);
        Student s2 =new Student("df",3);
        Student s3 =new Student("qwer",2);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
