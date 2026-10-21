import java.util.Scanner;

public class 三元运算符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入一个整数；
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        //输入第二个整数；
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        //设立中间值；
        int temp = num > num2 ? num : num2;
        int temp1 = temp - num == 0 ? temp -num2 : temp - num;
        System.out.println("两个数的差为：" + temp1);


    }
}
