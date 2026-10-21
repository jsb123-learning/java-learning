package 方法;

import java.util.Scanner;

public class 计算快递邮费 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字");
        double weight = sc.nextDouble();
        while(weight<=0){
            System.out.println("不能小于或等于0");
            weight = sc.nextDouble();
        }
        //定义总价
        double sum=0;
        //定义首重1kg
        sum=first()+second(weight)+third(weight);
        System.out.println("总价是"+ sum);
    }
    public  static int first(){
        int sum=10;
        return sum;
    }
    public static double second(double w){
        double sum =0;
        if(w>=5){
            sum=4*2;
        }else
            sum=(w-1)*2;
        return sum;
    }
    public static double third(double w){
        double sum=0;
        if(w>5){
            sum=(w-5)*1.5;
        }
        return sum;
    }

}
