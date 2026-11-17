package 序列化流_自练习;

import java.io.Serializable;

public class student implements Serializable {
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
