package jsb123intry;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class User {
    Scanner sc = new Scanner(System.in);
    private String id="jsb" ;
    private String username;
    private String passwd;
    private boolean status;

    public User() {
    }

    public User( String username, String passwd, boolean status) {
        this.passwd = passwd;
        this.status = status;
    }

    public String getId() {
        Random r =new Random();
        StringBuilder sb = new StringBuilder(id);
        for (int i = 0; i < 5; i++) {
            sb.append(r.nextInt(0,10));
        }
        id = sb.toString();
        return id;
    }//id

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        System.out.println("请注册用户名（3-16位数字和字母组合，不能是纯数字）");
        System.out.print(":");
        String name = sc.nextLine();
        boolean b=true;
        char a[ ] =name.toCharArray();
        int count=0;
        if(name.length()<3||name.length()>16){
            System.out.println("长度不能小于3大于16");
            b=false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(!((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z')||(a[i]>='0'&&a[i]<='9'))){
                System.out.println("必须由数字和字母组合");
                b=false;
            }else if(a[i]>='0'&&a[i]<='9'){
                count++;
            }
        }
        if(count==name.length()){
            System.out.println("不能是纯数字");
            b=false;
        }
        if(b){
            this.username=name;
        }else {
            setUsername();
        }
    }//用户名

    public String getPasswd() {
        return passwd;
    }
    public void setPasswd() {//密码
        System.out.println("请设置密码（3-8位，数字和字母的组合）：");
        System.out.print(":");
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        String upwd =sc.nextLine();
        char a[] = upwd.toCharArray();
        if(upwd.length()<3||upwd.length()>8){
            System.out.println("密码长度必须在3-8位之间：");
            b=false;
        }
        int countnum=0;
        int countchar=0;
        for (int i = 0; i < a.length; i++) {
            if(!((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z')||(a[i]>='0'&&a[i]<='9'))){
                System.out.println("密码必须是数字和字母的组合");
                b=false;
            }else if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z')){
                countchar++;
            }else if (a[i]>='0'&&a[i]<='9'){
                countnum++;
            }
        }
        if(countchar==a.length){
            System.out.println("不能是纯字母");
            b=false;
        }else if (countnum==a.length){
            System.out.println("不能是纯数字");
            b=false;
        }
        if(b){
            this.passwd=upwd;
        }else{
            setPasswd();
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

