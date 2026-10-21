package 继承_最终联系看这个;

public class bStudent extends Student{
    public bStudent(String name, int age, String garde) {
        super(name, age, garde);
    }

    public bStudent() {
    }

    @Override
    public void study() {
        System.out.println("学生在攻读学士学位");
    }
}
