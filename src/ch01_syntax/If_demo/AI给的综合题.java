package If_demo;

import java.util.Scanner;

public class AI给的综合题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //从键盘输入一名学生的名字以及三门成绩；
        System.out.println("请输入学生的名字：");
        String name = sc.next();
        System.out.println("请输入学生的语文成绩：");
        int ch = sc.nextInt();
        System.out.println("请输入学生的数学成绩：");
        int ma = sc.nextInt();
        System.out.println("请输入学生的英语成绩：");
        int en = sc.nextInt();
        //计算总分和平均分；
        int sum  = ch + ma + en;
        int avg = sum / 3;
        //判断等级；
        if(avg >= 60){
            if(avg >=80){
                if(avg >= 90){
                    System.out.println(name + "等级为优秀");
                }else{
                    System.out.println(name + "等级为良好");
                }
            }else{
                System.out.println(name + "等级为及格");
            }
        }else{
            System.out.println(name + "等级为不及格");
        }

    }
}
