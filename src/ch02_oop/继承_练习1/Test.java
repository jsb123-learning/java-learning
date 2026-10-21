package 继承_练习1;

public class Test {
    public static void main(String[] args) {
        manager m = new manager(1,"张三", 5000,1000);
        System.out.println("workid:"+m.getWorkId()+"name:"+m.getName()+"gain:"+m.getGain()+"bouns"+m.getBonus());
        m.work();
        m.eat();
    }
}
