package 抽象类_接口_综合练习;

public class TTCoach extends Coach implements English{
    public TTCoach() {
    }

    public TTCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void speakEnglish() {
        System.out.println("TTCoach is speaking English");
    }

    @Override
    public void teach() {
        System.out.println(super.getName()+" "+"TTCoach is teaching");
    }
}
