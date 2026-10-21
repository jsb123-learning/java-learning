package jsb123intry;

public class Mage extends enemyRole{
    @Override
    public double skill() {
        System.out.print("神秘法师使用了大火球,");
        return ATK*1.8;
    }
}
