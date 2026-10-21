package 继承_最终联系看这个;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //行为;
    public void eat() {
        System.out.println("吃吃吃");
    }
    public void sleep() {
        System.out.println("睡睡睡");
    }
}
