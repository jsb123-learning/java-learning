package 继承_ITheima;

public class Phone extends Goods{
    public void call(){
        System.out.println("打电话");
    }
    public void massge(){
        System.out.println("发短信");
    }
    public  void function(Phone i){
        i.massge();
        i.call();
    }
}
