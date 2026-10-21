import java.util.Scanner;

public class 统计字符次数 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        //遍历字符串；
        int daxie=0;
        int xiaoxie=0;
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(a>='A'&&a<='Z'){
                daxie++;
            }else if(a>='a'&& a<='z'){
                xiaoxie++;
            }else if(a>='0' && a<='9'){
                num++;
            }
        }
        //输出结果
        System.out.println("大写字符:"+daxie);
        System.out.println("小写字符："+xiaoxie);
        System.out.println("数字："+num);
    }
}
