package If_demo;

import java.util.Scanner;

public class 计算BMi_if判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入身高和体重
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        while (height >=3){
            System.out.println("不要户吊车，单位是m，姚明都每你高");
            height = sc.nextDouble();
        }
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        //计算BMI
        double bmi = weight / (height * height);
        //判断BMI
        if (bmi < 18.5) {
            System.out.println("BMI过低" + bmi);
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("BMI正常" + bmi);
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("BMI过重" + bmi);
        } else {
            System.out.println("BMI肥胖");
        }
    }
}
