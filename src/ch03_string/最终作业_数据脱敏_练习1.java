import javax.sound.midi.Soundbank;

public class 最终作业_数据脱敏_练习1 {
    public static void main(String[] args) {
        String phnum = "13861293771";
        String email = "jsb123@dsb.com";
        //把手机号中间四位变成“****”；
        System.out.println(phnum.replace(phnum.substring(3,7),"****"));
        //查找@所在索引；
        int i = email.indexOf("@");
        System.out.println(email.replace(email.substring(1,i),"***"));
    }
}
