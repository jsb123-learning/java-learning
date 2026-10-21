package 继承_构造方法的Test;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", 18, "grade1");
        s.show();
        Teacher t = new Teacher("lisi", 30, "teacher1");
        t.show();
    }
}
