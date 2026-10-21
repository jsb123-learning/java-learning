import java.util.Scanner;

public class 数值拆分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数值拆分
        //输入一个三位整数；
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        //拆分百位
        System.out.println("百位是：" + num / 100);
        //差分十位
        System.out.println("十位是：" + (num % 100) / 10);
        //拆分个位
        System.out.println("个位是：" + num % 10);

    }
}
