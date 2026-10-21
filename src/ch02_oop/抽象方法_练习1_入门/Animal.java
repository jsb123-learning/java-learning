package 抽象方法_练习1_入门;

import java.lang.ref.PhantomReference;

public abstract class Animal {
    private String name;
    private String color;

    public Animal() {

    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();
    public void drink() {
        System.out.println(this.color + "的" + this.name + "正在喝");
    }
}
