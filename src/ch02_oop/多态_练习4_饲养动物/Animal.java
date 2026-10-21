package 多态_练习4_饲养动物;

public class Animal {
    private int age;
    private String color;
    private String food;

    public Animal(int age, String color, String food) {
        this.age = age;
        this.color = color;
        this.food = food;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public void eat (){
        System.out.println(this.color+"动物在吃"+this.food);
    }
}
