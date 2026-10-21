package 抽象方法_练习1_入门;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(super.getColor()+"的"+super.getName()+"狗吃肉");
    }
    public void lookHome() {
        System.out.println("狗看家");
    }
}
