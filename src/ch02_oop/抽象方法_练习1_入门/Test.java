package 抽象方法_练习1_入门;

import 多态_练习1_初步了解.Admin;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("旺财", "黄色");
        dog.eat();
        dog.drink();
        change(dog);
        Animal cat =new Cat("咪咪", "白色");
        cat.eat();
        cat.drink();
        change(cat);
    }
    public static void change(Animal s){
        if(s instanceof Dog){
            Dog d = (Dog)s;
            d.lookHome();
        }else if(s instanceof Cat){
            Cat c = (Cat)s;
            c.catchMouse();
        }
    }
}
