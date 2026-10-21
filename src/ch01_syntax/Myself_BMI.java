public class Myself_BMI {
    public static void main(String[] args) {
        //个人体重赋值
        double w=64.5;
        //个人身高赋值
        double t=1.83;
        //BMI
        double BMI=w/(t*t);
        System.out.println("BMI:"+BMI);
        // 拓展:
        //我当前的身高在标准BMI下最高是多少钱千克
        double s=23.9;
        double maxw=s*t*t;
        System.out.println("当前体重最高体重:"+maxw);
        double maxt=Math.sqrt(w/s);
        System.out.println("当前身高最高身高:"+maxt);

    }
}
