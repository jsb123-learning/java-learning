package jsb123intry;

public class Warrior extends enemyRole{
    @Override
    public double skill() {
        System.out.print("初级战士使用了猛击,");
        return ATK*1.5;
    }
}
