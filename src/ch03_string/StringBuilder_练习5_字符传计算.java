import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.util.Locale;

public class StringBuilder_练习5_字符传计算 {
    public static void main(String[] args) {
        //定义字符串
        String str = "88311";
        String str1= "12395";
        String tmp;
        if(str.length()<str1.length()){
            tmp =str;
            str=str1;
            str1=tmp;
        }
        //进行同长处理;
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb1 = new StringBuilder(str1);
        sb1.reverse();
        while(sb1.length()!=sb.length()){
            sb1.append("0");
        }
        sb1.reverse();
        //定义sum数组
        int sum [] = new int[sb.length()+1];
        //转为数字数组
        int num [] = new int[sb.length()];
        int num1[] = new int[sb1.length()];
        for (int i = 0; i < num.length; i++) {
            num[i]=sb.charAt(i)-'0';
        }
        for (int i = 0; i < num1.length; i++) {
            num1[i]=sb1.charAt(i)-'0';
        }
        //开始数字模拟计算
        int next =0;
        for (int i = num.length-1; i >=0; i--) {
            //进位判定
             next = 0;
            if(sum[i+1]+num[i]+num1[i]>=10){
                next=1;
                sum[i+1]=(sum[i+1]+num[i]+num1[i])%10;
            }else {
                sum[i+1]=sum[i+1]+num[i]+num1[i];
            }
            if(next==1){
                sum[i]=1;
            }
        }
        //判断需要哪一部分数组；
        StringBuilder sb2 =new StringBuilder();
        if(next!=0){
            sb2.append(next);
        }
            for (int i = 1; i < sum.length; i++) {
                sb2.append(sum[i]);
        }
        String res =sb2.toString();
        System.out.println(res);
    }


}
