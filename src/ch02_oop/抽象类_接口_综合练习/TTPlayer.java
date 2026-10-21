package 抽象类_接口_综合练习;

public class TTPlayer extends Player implements English
{
    public TTPlayer() {
    }

    public TTPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void play() {
        System.out.println(super.getName()+" "+"TTPlayer is playing");
    }
    @Override
    public void speakEnglish() {
        System.out.println(super.getName()+" "+"TTPlayer is speaking English");
    }
}
