import java.util.Scanner;

public class 数据脱敏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter words:");
        String str = sc.next();
        //脱敏处理
        System.out.print(str.substring(0,1)+"***"+str.substring(str.length()-1,str.length()));
    }
}
