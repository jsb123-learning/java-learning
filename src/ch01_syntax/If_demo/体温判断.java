package If_demo;

import java.util.Scanner;

public class 体温判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体温：");
        double t = sc.nextDouble();
        if (t >= 37.5)
        {
            System.out.println("体温异常");
        }
        else
        {
            System.out.println("体温正常");
        }
    }
}
