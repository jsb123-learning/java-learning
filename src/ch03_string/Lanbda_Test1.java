import 匿名内部类_练习.Swim;

public class Lanbda_Test1 {
    public static void main(String[] args) {
        method(()->{
            System.out.println("swimming");
        });
    }
    public static  void method(Swim s){
        s.swimming();
    }
    interface Swim{
        void swimming();
    }
}

