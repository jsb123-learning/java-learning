package Special_Test;

import java.util.Random;
import java.util.Scanner;

public class 原神抽卡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //设置保底计数器；
        int count = 0;
        //奖池中奖随机数；
        int reward = r.nextInt(100);
        //用户输入：1
        System.out.println("请输入1开始抽奖");
        int input = sc.nextInt();
        while (input != 1){
            System.out.println("别犟让你输1,就输1");
            input = sc.nextInt();
        }
        //设置奖池；
        int pool = 0;
        while( true ){
            //设置奖池随机数
             pool = r.nextInt(reward-10+count,reward+1);
             if(reward != pool){
                 //询问是否继续
                 System.out.println("没有抽到真可惜，继续1，不继续0   "+"距离保底还剩"+ (9-count)+"次");
                 input = sc.nextInt();
                 count++;
                 if(input==1) continue;
                 else {
                     System.out.println("算了算了给你巴");
                     break;
                 }
             }else {
                 System.out.println("恭喜你抽到了");
                 break;
             }
        }
    }
}
