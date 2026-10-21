import java.util.Scanner;

public class 最终作业_计算某个字符出现的次数_练习2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入字符串
        System.out.println("please enter a string");
        String str = sc.next();
        //输入字符；
        System.out.println("please enter a char");
        String cha =sc.next();
        //转为数组；
        char arstr[] = str.toCharArray();
        char archa[] = cha.toCharArray();
        //进行大小写模糊判定
        char x=' ';
        if(archa[0]>='a'&&archa[0]<='z'){
            x=(char)(archa[0]-32);
        }else if (archa[0]>='A'&&archa[0]<='Z'){
            x=(char)(archa[0]+32);
        }
        //循环判断；
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(arstr[i]==x||arstr[i]==archa[0]){
                count++;
            }
        }
        System.out.println("String has "+count+" char");
    }
}
