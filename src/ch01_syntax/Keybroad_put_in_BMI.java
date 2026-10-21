import java.util.Scanner;

public class Keybroad_put_in_BMI {
    public static void main(String[] args) {

        //应用Scanner;
        Scanner sc = new Scanner(System.in);
        //输入本人的身高
        System.out.println("请输入本人的身高：");
        double height = sc.nextDouble();
        //输入本人的体重
        System.out.println("请输入本人的体重：");
        double weight = sc.nextDouble();

        //计算BMI；
        double BMI =  weight / (height * height);
        //输出BMI；
        System.out.println("Your BMI is："+BMI);
    }
}
