package 多态_练习2_人与交通工具;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        Transportation t = new Car("Car", 100);
        person.travel(t);
        Transportation t2 = new Bicycle("Bicycle", 50);
        person.travel(t2);
    }
}
