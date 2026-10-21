package 多态_练习4_饲养动物;

public class Dog extends Animal {
    public Dog(int age, String color, String food) {
        super(age, color, food);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println(super.getColor()+"的狗在吃"+super.getFood());
    }
    public void run() {
        System.out.println(super.getColor()+"的狗在跑");
    }
}
