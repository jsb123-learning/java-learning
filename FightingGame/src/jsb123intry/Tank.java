package jsb123intry;

import java.time.temporal.TemporalUnit;

public class Tank extends enemyRole{
    @Override
    public double skill() {
        System.out.print("重装坦克使用了坚固防御,");
        defending= true;
        return 0;
    }
}
