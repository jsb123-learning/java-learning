package 抽象类_接口_综合练习;

public class BPlayer extends Player{
    public BPlayer() {
    }

    public BPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("BPlayer is playing");
    }
}
