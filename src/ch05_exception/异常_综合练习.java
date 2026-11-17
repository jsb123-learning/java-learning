import java.util.InputMismatchException;
import java.util.Scanner;

public class 异常_综合练习 {
    public static void main(String[] args) {
        //要求：异常数据无法录入，并报相应异常
        Scanner sc = new Scanner(System.in);
        String name ;
        int age ;
        //数据校验
        while(true){
            try {
                name = nameIn(sc);
                age=ageIn(sc);
                break;
            } catch (NumberFormatException a) {
                System.out.println("你输入的什么东西阿");
                System.out.println("重新回忆");
            }catch(RuntimeException a ){
                System.out.println("重新回忆");
            }
        }

        //输出成功数据
        System.out.println("她的名字："+name+"，当年几时："+age);
    }
    public static String nameIn(Scanner sc ){
        String name = sc.nextLine();
        //字符串无需异常校验，输入什么是什么
        //空格校验
            if((name == null) || (name.isBlank())){
                System.out.println("她的名字还带虚空？");
                throw new RuntimeException();
            }
            //长度校验
            if((name.length() < 2 ) || (name.length() >5)){
                System.out.println("名字怎么这么奇怪？");
                throw new RuntimeException();
            }
            //标点符号，数字校验
            if (name.matches(".*[\\d\\p{P}\\p{S}].*")){
                System.out.println("神奇数字人！");
                throw new RuntimeException();
            }
        return  name;
    }
    public static int  ageIn(Scanner sc ){

            //是否是数字校验
            String age = sc.nextLine();
            int ageNum = Integer.parseInt(age);
            //年龄校验
            if(ageNum>40||ageNum<18){
                throw new RuntimeException();
            }
            return ageNum;
        }
    }

