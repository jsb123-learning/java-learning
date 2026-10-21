package 接口_练习1_游泳的动物;

public class Test {
    public static void main(String[] args) {
        Cat c =new Cat("xiaomao","black");
        c.eat();
        Dog d = new Dog("xiaogou" ,"yellow");
        d.eat();
        d.swim();
        Gua g = new Gua("qingwa","green");
        g.eat();
        g.swim();
    }
}
