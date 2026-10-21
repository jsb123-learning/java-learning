//确定scanner位置
import java.net.SocketOption;
import java.util.Scanner;

public class Keybroad_put_in {
    public static void main(String[] args) {
        /*
        键盘录入:
        1:找到Scanner
        2:让Scanner工作
         */

        // 找到Scanner
        Scanner sc = new Scanner(System.in);

        //让Scanner干活
        //接受键盘录入的整数
        int a = sc.nextInt();
        System.out.println(a);
        //接受键盘录入的小数
        double b = sc.nextDouble();
        System.out.println(b);
        //接受键盘录入的文本(字符串)
        String c = sc.next();
        System.out.println(c);
    }
}
