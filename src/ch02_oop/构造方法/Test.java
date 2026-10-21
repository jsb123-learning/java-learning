package 构造方法;

public class Test {
    public static void main(String[] args) {
        Student s =new Student();
        Student s1 =new Student("张三",18,'男');
        s.setName("lisi");
        System.out.println(s.getName());
        System.out.println(s1.getName());
    }

}
