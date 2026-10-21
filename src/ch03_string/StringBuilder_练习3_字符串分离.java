import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringBuilder_练习3_字符串分离 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter something:");
        String str = sc.next();
        //创建字符对象
        StringBuilder sb = new StringBuilder(str);
        //处理字符串格式
        while (sb.length()%8!=0) {
            sb.append("0");
        }
        //
        /*自己的
        str=sb.toString();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if((i+1)%8==0){
                System.out.println();
            }
        }
       */
        //参考ITheima改良的；
        for (int i = 0; i < sb.length(); i+=8) {
            System.out.println(sb.substring(i,i+8));
        }

    }
}
