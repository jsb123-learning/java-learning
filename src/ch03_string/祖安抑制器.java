import java.util.Scanner;

public class 祖安抑制器 {
    public static void main(String[] args) {
        //输入文本
        System.out.println("开始攻击");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(cnm(str));
    }
    public static String cnm(String a){
        String b[]={"cnm","sb","尼玛","死","草","妈","逼"};
        for (int i = 0; i < b.length; i++) {
            a=a.replace(b[i],"***");
        }

        return  a;
    }
}
