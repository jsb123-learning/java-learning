package 继承_本类的其他构造;

public class Student {
    private String name;
    private int age;

    public Student() {
        this("同学",18);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
