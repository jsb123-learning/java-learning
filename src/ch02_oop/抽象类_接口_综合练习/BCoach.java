package 抽象类_接口_综合练习;

public class BCoach extends Coach{
    public BCoach() {
    }

    public BCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(super.getName()+" "+"BCoach is teaching");
    }
}
