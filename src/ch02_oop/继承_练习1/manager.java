package 继承_练习1;

public class manager  extends worker{
    private int bonus;

    public manager() {
    }

    public manager(int workId, String name, int gain, int bonus) {
        super(workId, name, gain);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("manager is managing");
    }
}
