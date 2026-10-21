import java.util.Scanner;

public class 最终作业_最后一个单词的长度_练习3 {
    public static void main(String[] args) {
        //输入一串英文语句；
        Scanner sc = new Scanner(System.in);
        String sts = sc.nextLine();
        //查找空格最后一次出现的索引；
        int i = sts.indexOf(' ');
        System.out.println(i);
        int res = sts.length() -i-1;
        System.out.println("the last word lenth is "+res+" name of"+sts.substring(i));
    }
}
