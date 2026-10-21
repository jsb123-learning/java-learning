package 方法的重写3_注意汇总;

public class Test {
    public static void main(String[] args) {
        //无参构造；调用父类无参构造
        Fu z =new Zi();
        z.method();
        Fu f =new Fu();
        f.method();
    }
}
