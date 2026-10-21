package 接口_练习1_游泳的动物;

public class Dog extends Animal implements swim{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(super.getColor()+super.getName()+"eat bone");
    }

    @Override
    public void swim() {
        System.out.println("dog swim");
    }
}
