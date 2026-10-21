package Switch_demo;

import java.util.Scanner;

public class 模拟计算器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double num1 = sc.nextDouble();
        System.out.println("请输入运算符：");
        char operator = sc.next().charAt(0);
        System.out.println("请输入第二个数：");
        double num2 = sc.nextDouble();
        //数字排列
        double temp =0;
        if (num1 < num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //开始计算

        switch (operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("输入错误");
        }
    }


    }

