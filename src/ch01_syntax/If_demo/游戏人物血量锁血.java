package If_demo;

import java.util.Scanner;

public class 游戏人物血量锁血 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入游戏人物的血量
        System.out.println("请输入游戏人物的血量：");
        int hp = sc.nextInt();
        //输入受到伤害；
        System.out.println("请输入受到伤害：");
        int atk = sc.nextInt();
        //输入恢复的血量；
        System.out.println("请输入恢复的血量：");
        int bag = sc.nextInt();
        //计算人物血量=初始血量-受到伤害+恢复(人物的血量始终大于1);
        int sum = hp - atk ;
        if (sum < 1)
        {
            sum = 1 +bag;
        }
        else
        {
            sum = sum + bag;
        }
        //输出人类现存血量；
        System.out.println("现在的血量:" + sum);
    }
}
