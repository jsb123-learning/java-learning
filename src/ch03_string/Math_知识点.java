import javax.sound.midi.Soundbank;

public class Math_知识点 {
    public static void main(String[] args) {
        //abs取得绝对值
        int a =-1;
        System.out.println(Math.abs(a));
        a=1;
        System.out.println(Math.abs(a));
        //ceil向上取整；
        System.out.println(Math.ceil(10.11));
        //floor向下取整；
        System.out.println(Math.floor(10.99));
        //round四舍五入;
        System.out.println(Math.round(10.49));
        System.out.println(Math.round(10.50));
        //比较整数取最大值；
        System.out.println(Math.max(10,20));

    }
}
