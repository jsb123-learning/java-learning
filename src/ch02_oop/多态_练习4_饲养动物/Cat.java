package 多态_练习4_饲养动物;

public class Cat extends Animal {
    public Cat(int age, String color, String food) {
        super(age, color, food);
    }

    public Cat() {
    }


    @Override
    public void eat() {
        System.out.println(super.getColor()+"的猫在吃"+super.getFood());
    }
    public void catchMouse() {
        System.out.println(super.getColor()+"的猫在抓老鼠");
    }
}

