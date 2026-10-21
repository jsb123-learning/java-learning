import java.util.Scanner;

public class 回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入一个四位整数；
        System.out.println("请输入一个四位整数：");
        int num = sc.nextInt();
        //给位数取值；
        //千位；
        int thousand = num / 1000;
        //百位；
        int hundred = num / 100 % 10;
        //十位；
        int ten = num / 10 % 10;
        //个位；
        int unit = num % 10;
        //判断是否是回文数；
        boolean result= (thousand == unit) && (hundred == ten);
        System.out.println("该数字是回文数：" + result);
    }
}
