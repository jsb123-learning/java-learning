import java.util.Scanner;

public class Math_idea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //收入第一个数字（第一个比第二个大）；
        System.out.println("请输入第一个较大整数：");
        int nummax = sc.nextInt();
        //输入第二个较小数字；
        System.out.println("请输入第二个较小整数：");
        int nummin = sc.nextInt();
        //输出整数加减乘除取余
        System.out.println("两个整数的和为：" + (nummax + nummin));
        System.out.println("两个整数的差为：" + (nummax - nummin));
        System.out.println("两个整数的积为：" + (nummax * nummin));
        System.out.println("两个整数的商为：" + (nummax / nummin));
        System.out.println("两个整数的余为：" + (nummax % nummin));
        //
        //
        //小数计算
        //细节
        //   小数直接参与计算可能数值不精确
        System.out.println("请输入第一个较大小数：");
        double nummax1 = sc.nextDouble();
        System.out.println("请输入第二个较小小数：");
        double nummin1 = sc.nextDouble();
        System.out.println("两个小数的和为：" + (nummax1 + nummin1));
        System.out.println("两个小数的差为：" + (nummax1 - nummin1));
        System.out.println("两个小数的积为：" + (nummax1 * nummin1));
        System.out.println("两个小数的商为：" + (nummax1 / nummin1));
    }
}

