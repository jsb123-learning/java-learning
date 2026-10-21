package 接口_练习1_游泳的动物;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("cant swim but like eat fish" );
    }
}
