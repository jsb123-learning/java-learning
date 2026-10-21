import java.util.Scanner;

public class 关系运算符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //录入a的身高；
        System.out.println("请输入A的身高：");
        double heightA = sc.nextDouble();
        //录入b的身高；
        System.out.println("请输入B的身高：");
        double heightB = sc.nextDouble();
        System.out.println("双方谁更高" + (heightA > heightB));


    }
}
