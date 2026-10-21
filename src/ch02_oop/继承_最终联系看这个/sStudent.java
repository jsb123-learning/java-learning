package 继承_最终联系看这个;

public class sStudent extends Student{
    public sStudent() {
    }

    public sStudent(String name, int age, String garde) {
        super(name, age, garde);
    }

    @Override
    public void study() {
        System.out.println("学生在攻读硕士学位");
    }

    @Override
public void sleep() {
    System.out.println("学生正在豪华公寓睡觉");
}
}

