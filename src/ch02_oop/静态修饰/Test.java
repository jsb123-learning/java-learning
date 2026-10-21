package 静态修饰;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("shishi");
        //通过类名访问静态方法
        Student.setTeacher("Mr. Wang");
        Student s1= new Student();
        System.out.println(s1.getTeacher());
        //更换静态变量
        Student.change("liu");
        System.out.println(s.getTeacher());
    }

}
