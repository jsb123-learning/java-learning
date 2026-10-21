package 接口_练习1_游泳的动物;

public class Gua extends Animal implements swim{
    public Gua() {
    }

    public Gua(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("eat flys");
    }

    @Override
    public void swim() {
        System.out.println("gua swim");
    }
}
