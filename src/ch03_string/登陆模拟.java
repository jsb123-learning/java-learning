import java.util.Random;
import java.util.Scanner;

public class 登陆模拟 {
    public static void main(String[] args) {
        //设置用户名密码;
        //用户名
        String name = new String("jsb123");
        //密码
        String passwd = new String("jsb098");
        int i=1;
        while(i<=3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String userName = sc.nextLine();
            System.out.println("请输入密码：");
            String userPasswd = sc.nextLine();
            if(name.equals(userName) && passwd.equals(userPasswd)){

                System.out.println("登录成功！");
                break;
            }
            else{
                //验证码生成；
                char a[] = new char[5];
                String yanz =getString(a);
                //
                System.out.println("用户名或密码错误，请重新输入！还剩"+(3-i)+"次机会");
                System.out.println("请输入验证码："+yanz);
                String code = sc.nextLine();
                while(!code.equalsIgnoreCase(yanz)){
                    System.out.println("验证码错误，请重新输入！");
                    yanz = getString(a);
                    System.out.println("请输入验证码："+yanz);
                    code = sc.nextLine();
                }
                if(i==3){
                    System.out.println("您已输入达到错误次数，请稍后再试！");
                }
            }
            i++;
        }
    }
    public static String getString(char a[]) {
        Random r =new Random();
        for(int j=0;j<5;j++) {
            int b=0;
            b=r.nextInt(1,4);
            switch(b) {
                case 1:
                    a[j] = (char)(r.nextInt(26) + 'a');
                    break;
                case 2:
                    a[j] = (char)(r.nextInt(10) + '0');
                    break;
                case 3:
                    a[j] = (char)(r.nextInt(26) + 'A');
                    break;
            }

        }
        return new String(a);
    }
}
