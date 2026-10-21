import java.util.Random;
import java.util.zip.CheckedOutputStream;

public class 最终作业_练习6_生成验证码 {
    public static void main(String[] args) {
        Random r = new Random();
        //验证码容器数组；
        char arr[] = new char[5];
        int count=0;
        for (int i = 0; i < 5; i++) {
            //生成随机数；
            int gide;
            if(count==0){
                 gide=r.nextInt(1,4);
            }else {
                 gide=r.nextInt(1,3);
            }
            switch (gide){
                case 1:
                    arr[i]=(char)(r.nextInt(26)+'a');
                    break;
                case 2:
                    arr[i]=(char)(r.nextInt(26)+'A');
                    break;
                case 3:
                    arr[i]=(char)(r.nextInt(10)+'0');
                    count++;
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
