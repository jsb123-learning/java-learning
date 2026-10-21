import java.util.Scanner;

public class 最终作业_练习5_寻找数字字符串 {
    public static void main(String[] args) {
        //输入一个字符串；
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        //创建sb对象；
        StringBuilder sb =new StringBuilder(str);
        //定义双指针
        int p1 =0 ;
        int p2=0;
        //循环查找数字前后位置
        for (int i = 0; i < sb.length();i++) {
            //查找第一个数字的位置；
            if(sb.charAt(i)>='0'&&sb.charAt(i)<='9'){
                p1 = i;
                p2=p1;
                while(sb.charAt(p2)>='0'&&sb.charAt(p2)<='9'&&p2<sb.length()-1){
                    p2++;
                }
                System.out.println(p1+","+p2);
                sb.insert(p1,"*");
                if(p2+1!=sb.length()-1){
                    sb.insert(p2+1,"*");
                }else {
                    sb.append("*");
                }
                i=p2+2;
            }
        }
        System.out.println(sb);
    }

}
