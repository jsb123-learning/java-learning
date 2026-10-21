package 多态_练习4_饲养动物;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("zhangsan", 18);
        Animal a = new Dog(1, "white", "bone");
        p.keepPet(a, a.getFood());
        Animal c =new Cat(1, "black", "mouse");
        p.keepPet(c, c.getFood());
    }
}
