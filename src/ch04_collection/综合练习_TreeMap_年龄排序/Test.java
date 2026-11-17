package 综合练习_TreeMap_年龄排序;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("赵云", 20);
        Student s2 = new Student("李白", 29);
        Student s3 = new Student("关羽", 58);
        Student s4 = new Student("曹操", 65);
        TreeMap<Student,String> tm = new TreeMap<>((student1,student2)->{
            return student2.getAge()-student1.getAge();
        });
        tm.put(s1,"changshan");
        tm.put(s2,"longzhong");
        tm.put(s3,"maicheng");
        tm.put(s4,"langya");
        tm.forEach((s,place)->{
            System.out.println(s+" "+place);
        });
    }
}
