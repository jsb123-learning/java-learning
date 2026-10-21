package If_demo;

import java.util.Scanner;

public class 直角位置坐标系判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入坐标系
        System.out.println("请输入坐标系：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        //判断位置
        if(x==0 && y==0)
            System.out.println("坐标系原点");
        else if(x==0)
            System.out.println("y轴");
        else if(y==0)
            System.out.println("x轴");
        else if(x>0 && y>0)
            System.out.println("第一象限");
        else if(x<0 && y>0)
            System.out.println("第二象限");
        else if(x<0 && y<0)
            System.out.println("第三象限");
        else if(x>0 && y<0)
            System.out.println("第四象限");
    }
}
