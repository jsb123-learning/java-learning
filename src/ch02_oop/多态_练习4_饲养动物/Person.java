package 多态_练习4_饲养动物;

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
    public void keepPet(Animal a, String food ){
        a.eat();
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.run();
        }else if(a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }
    }
}
