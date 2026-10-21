package If_demo;

import java.util.Scanner;

public class 考试成绩合格判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入考试成绩；
        System.out.println("请输入考试成绩：");
        double score = sc.nextDouble();
        //判断成绩合理性；
        if(score < 0 || score > 100){
            System.out.println("输入成绩不合理请重新输入");
            return;
        }

        //判断考试成绩；
        if(score >= 60){
            System.out.println("考试成绩合格");
        } else {
            System.out.println("考试成绩不合格");
        }
    }
}
