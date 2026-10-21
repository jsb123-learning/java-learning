package If_demo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class 游戏人物血量 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //游戏人物血量200；
        int hp = 200 ;
        //输入受到伤害；
        System.out.println("输入受到的伤害");
        int atk = sc.nextInt();
        //输入恢复的血量；
        System.out.println("输入恢复的血量");
        int bag = sc.nextInt();
        //死亡判断
        if (hp - atk <= 0) {
            System.out.println("游戏人物死亡");
        } else {
            System.out.println("血量剩余" + (hp - atk + bag ));
        }

    }
}
