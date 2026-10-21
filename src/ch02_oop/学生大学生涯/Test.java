package 学生大学生涯;

import java.awt.print.Printable;

public class Test {
    public static void main(String[] args) {
        //大一状况
        Student s =new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
        System.out.println("大一"+s.getName()+" "+s.getAge()+"身高："+s.getHeight()+"体重："+s.getWeight());
        s.study();
        //
        Student s1 =new Student();
        s1.setName("张三");
        s1.setAge(s.getAge()+1);
        s1.setHeight(s.getHeight());
        s1.setWeight(s.getWeight()+10);
        System.out.println("大二"+s1.getName()+" "+s1.getAge()+"身高："+s1.getHeight()+"体重："+s1.getWeight());
        //
        Student s2 =new Student();
        s2.setName("张三");
        s2.setAge(s1.getAge()+1);
        s2.setHeight(s1.getHeight()+2);
        s2.setWeight(s1.getWeight()-3);
        System.out.println("大三"+s2.getName()+" "+s2.getAge()+"身高："+s2.getHeight()+"体重："+s2.getWeight());
        System.out.print(s.getAge());
    }
}
