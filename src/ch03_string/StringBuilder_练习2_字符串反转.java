import java.util.Scanner;

public class StringBuilder_练习2_字符串反转 {
    public static void main(String[] args) {
        //录入字符串
        Scanner sc = new Scanner(System.in);
        //字符反转循环
        while(true){
            System.out.println("please enter String:");
            String str = sc.next();
            if(str.equals("baibai")){
                System.out.println("thanks for your use");
                break;
            }else{
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                System.out.println(sb);
            }
        }

    }
}
//预想设计到线程知识：反复反转直到输入对的字符
