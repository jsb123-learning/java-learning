package 多态_练习2_人与交通工具;

public class Car extends Transportation {
    public Car(String logo, int speed) {
        super(logo, speed);
    }

    public Car() {
    }
    public void carHonk() {
        System.out.println("car honk");
    }
}
