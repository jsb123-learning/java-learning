import java.util.Scanner;

public class 字母大小写转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //请输入一个大写字母
        System.out.println("请输入一个大写字母：");
        char bc = sc.next().charAt(0);
        System.out.println("转换后的小写字母是：" + (char)(bc + 32));
        //请输入一个小写字母
        System.out.println("请输入一个小写字母：");
        char sc1 = sc.next().charAt(1);
        System.out.println("转换后的大写字母是：" + (char)(sc1 - 32));
    }
}
