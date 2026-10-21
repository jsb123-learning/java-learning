package Special_Test;

import java.util.Scanner;

public class 三角判断_j较难 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入三个边长；（三角形的三边关系：任意两边之和大于第三边）
        System.out.println("请输入三个边长：");
        double a = sc.nextDouble();{
}
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        while(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("输入的边长不能构成三角形，请重新输入：");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }
        //判断三角形类型
        if (a == b && b == c && a == c){
            System.out.println("等边三角形");
        }else if (a == b || b == c || a == c){
            System.out.println("等腰三角形");
        }else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b){
            System.out.println("直角三角形");
        }else {
            System.out.println("普通三角形");
        }
    }
}
