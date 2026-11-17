import java.sql.SQLOutput;
import java.util.Scanner;

public class Math_练习2_自冪数 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        System.out.print("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //直接开始！
        int numCopy=num;
        double sum =0;
        //取得冪值；获取字符串长度,运算时模拟字符串
        int len=(num+"").length();
        while(num>=1){
            //复制num
            sum+=Math.pow(num%10,len);
            num=num/10;
        }
        System.out.println(sum);
        if(sum==numCopy){
            System.out.println("这个数字是是自冪数");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }


}
