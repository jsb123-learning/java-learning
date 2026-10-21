package 循环终止;

import java.util.Scanner;

public class 游戏人物血条录入 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            //录入受到伤害
            double damages = sc.nextDouble();
            //录入恢复血量
            double recovery = sc.nextDouble();
            if(damages > 0 && recovery > 0) break;
            System.out.println("输入有误，重新输入");
        }
    }
}
