import java.util.Scanner;

public class 时间转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入具体秒数；
        System.out.println("请输入具体秒数：");
        int seconds = sc.nextInt();
        //计算小时数字；
        int hour = seconds / 3600;
        //计算分钟数字；
        int minute = (seconds % 3600) / 60;
        //计算秒数字；
        int second = seconds % 60;
        //输出结果；
        System.out.println(hour + "小时" + minute + "分钟" + second + "秒");
    }
}
