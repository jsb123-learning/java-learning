package 继承_构造方法的Test;

public class Teacher extends Person{
    String title;

    public Teacher() {
    }

    public Teacher(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(title);
    }
}
