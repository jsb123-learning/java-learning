package 继承_构造方法的Test;

public class Student extends Person {
    private String garde;

    public Student() {

    }

    public Student(String name, int age, String garde) {
        super(name, age);
        this.garde = garde;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(garde);
    }
}
