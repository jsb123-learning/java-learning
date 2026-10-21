package 多态_练习2_人与交通工具;

public class Bicycle extends Transportation {
    public Bicycle(String logo, int speed) {
        super(logo, speed);
    }

    public Bicycle() {
    }
    public void bicycleRing() {
        System.out.println("bicycle ring");
    }
}
