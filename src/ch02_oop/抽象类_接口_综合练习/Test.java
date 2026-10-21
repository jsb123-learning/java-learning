package 抽象类_接口_综合练习;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {
        TTPlayer ttPlayer = new TTPlayer("张三", 20);
        ttPlayer.play();
        ttPlayer.speakEnglish();
        BCoach bCoach = new BCoach("李四", 20);
        bCoach.teach();
        Coach coach =new BCoach("李四", 20);
        Admin admin = new Admin();
        admin.adminC(coach);
        Coach TTcoach = new TTCoach("王五", 20);
        admin.adminC(TTcoach);
        System.out.println(TTcoach.getName());

    }
}
