package 综合练习_HashSet;

import java.util.Collection;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        Student student = new Student("jsb",123);
        Student student1 = new Student("jsb",123);
        Student student2 = new Student("zhangsan",123);
        Student student3 = new Student("wangwu",123);
        Collection<Student> stu = new HashSet<>();
        stu.add(student);
        stu.add(student1);
        stu.add(student2);
        stu.add(student3);
        stu.forEach(System.out::println);
    }
}
