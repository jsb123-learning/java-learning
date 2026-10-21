package jsb123intry;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login_in {
    public static void main(String[] args) {
        ArrayList<User> userlist =new ArrayList<>();//用户注册表
       while(MainLoading(userlist)!=3){
       }
    }
    public static int MainLoading(ArrayList<User> userlist){
        Scanner sc =new Scanner (System.in);
        System.out.println("《============================》");
        System.out.println("        欢迎来到文字游戏");
        System.out.println("《============================》");
        System.out.println("请选择操作：1登陆、2注册、3退出");
        int chioce =sc.nextInt();
        switch (chioce){
            case 2 : register(userlist) ;
            break;
            case 1 :userNamelogin(userlist);
            break;
            case 3 : return 3;

        }
        return 0;
    }
    public static void userNamelogin(ArrayList<User> userlist){
        //键盘录入用户名
        System.out.println("请输入您的账户：");
        Scanner sc  = new Scanner (System.in);
        String userName = sc.nextLine();
        //和用户注册表比对；
        boolean b = false;
        int i=0;
        for ( i = 0; i < userlist.size(); i++) {
            //如果用户表里有相关注册信息
            if(userName.equals(userlist.get(i).getUsername())){
                b=true;
                break;
            }
        }

        if(b){//用户已经注册；
            //则执行密码校验、并将方法返回值返回用户注册表中
            //判断用户是否被锁定
            if(userlist.get(i).getStatus()){
                userlist.get(i).setStatus(passwdConfirm(userlist.get(i).getPasswd()));
                //进入游戏体//////////////////////////////////////////////////////
                if(userlist.get(i).getStatus()){
                    gameMain.run(userlist.get(i));
                }
            }else {
                System.out.println("你的用户已经被锁定，请联系：jsb123");
            }
        }else {//用户未注册
            System.out.println("您的用户还未注册，请注册");
            register(userlist);
        }


    }//用户名登陆
    public static boolean passwdConfirm(String passwd){
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入您的密码：");
        String psd = sc.nextLine();
        boolean b =true;
        //进行校验
        if(psd.equals(passwd)){
            //生成验证码；
            String code=confirmCode();
            //验证码校验；
            System.out.println("请输入验证码校验："+code);
            String str= sc.nextLine();
            while(!str.equals(code)){
                code=confirmCode();
                System.out.println("验证码输入错位请重新输入："+code);
                str=sc.nextLine();
            }
            System.out.println("登陆成功！");
        }else{
            System.out.println("密码错误请重新输入密码：");
            System.out.println("您还有3次机会");
             psd = sc.nextLine();
             int count =0;
             while(!psd.equals(passwd)&&count<=1){
                 System.out.println("密码错误请重新输入密码：");
                 System.out.println("您还有"+(2-count)+"次机会");
                 psd = sc.nextLine();
                 count++;
             }
             if(count<=1){//密码输入成功
                 //生成验证码；
                 String code=confirmCode();
                 //验证码校验；
                 System.out.println("请输入验证码校验："+code);
                 String str= sc.nextLine();
                 while(!str.equals(code)){
                     code=confirmCode();
                     System.out.println("验证码输入错位请重新输入："+code);
                     str=sc.nextLine();
                 }
                 System.out.println("登陆成功！");
             }else {//密码输入失败账户被锁定；
                 System.out.println("你的账户已经被锁定！");
                 b= false;
             }
        }
        return b;
    } //（用户名登陆）密码校验
    public static void register(ArrayList<User> userlist){
        //注册
        Scanner sc = new Scanner(System.in);
        User user = new User();
        //获取用户id；
        System.out.println( "你的用户id是:"+user.getId());
        //注册用户名；
        user.setUsername();
        for (int i = 0; i < userlist.size(); i++) {
            String username = user.getUsername();
            if(username.equals(userlist.get(i).getUsername())){
                i=0;
                System.out.println("用户名已经存在，请重新设置：");
                user.setUsername();
                 username = user.getUsername();
                while(username.equals(userlist.get(i).getUsername())){
                    System.out.println("用户名已经存在，请重新设置：");
                    user.setUsername();
                    username = user.getUsername();
                }
            }
        }
        System.out.println("用户名注册成功：你的用户名是："+user.getUsername());
        //设置密码；
        user.setPasswd();
        String passwd = user.getPasswd();
        System.out.println("请输入第二次确认：");
        String upsd = sc.nextLine();
        while (!passwd.equals(upsd)){
                System.out.println("两次输入的密码不一样，请重新输入：");
                user.setPasswd();
                passwd=user.getPasswd();
                System.out.println("请输入第二次确认");
                 upsd = sc.nextLine();
        }
        //设置用户状态；
        user.setStatus(true);
        //将数据填写好的javaBean类对象，存储到集合中
        userlist.add(user);
        if(userlist.get(userlist.size()-1).getStatus()){
            System.out.println("用户状态正常");
        }else
            System.out.println("用户已被锁定");
        System.out.println("密码设置成功，你的密码是："+user.getPasswd());
    }//注册
    public static String confirmCode() {
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
        return (sb.toString());
    }//验证码生成；
}



