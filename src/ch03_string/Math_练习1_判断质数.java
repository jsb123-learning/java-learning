import java.util.Scanner;

public class Math_练习1_判断质数 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        //判断开始
        for (int i = 2; i < Math.pow(num,0.5); i++) {
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("数字"+num+"是质数");
        }
    }
}
