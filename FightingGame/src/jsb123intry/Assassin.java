package jsb123intry;

public class Assassin extends enemyRole {
    @Override
    public double skill() {
            System.out.print("敏捷刺客使用了快速攻击,");
            doubleShot = true;
            return ATK*0.5;
    }

}
