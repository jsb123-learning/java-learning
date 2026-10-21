import javax.swing.text.DefaultStyledDocument;
import java.util.Scanner;

public class 缘7数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入一个3位数；
        System.out.println("请输入一个3位数：");
        int seven = sc.nextInt();
        //取值；
        int hundrd = seven / 100;
        int ten = seven / 10 % 10;
        int unit = seven % 10;
        //条件判断
        if (hundrd  == 7|| ten == 7 || unit  == 7|| seven % 7 == 0)
        {
            System.out.println("该数字是缘7数");
        }
        else
        {
            System.out.println("该数字不是缘7数");
        }
    }
}
