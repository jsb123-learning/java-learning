package 抽象方法_练习1_入门;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(super.getColor()+"的"+super.getName()+"猫吃鱼");
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
