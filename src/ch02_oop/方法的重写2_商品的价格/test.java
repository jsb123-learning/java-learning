package 方法的重写2_商品的价格;

public class test {
    public static void main(String[] args) {
        //商品；
        Goods g = new Goods(1000.0, "商品");
        System.out.println(g.discount());
        //平板；
        //这里采用的是通过继承父类的有参构造方法来定义p对象的参数
        pad p =new pad(5000.0, "平板");
        System.out.println(p.discount());
        //手机；
        Phone po = new Phone();
        //这里采用的是通过继承父类set方法来定义po对象的参数
        po.setName("手机");
        po.setPrice(10000.0);
        System.out.println("手机原价"+po.getPrice()+"\t折后"+po.discount());
        //pad2
        pad2 p2 = new pad2(3000.0, "pad2");
        System.out.println(p2.discount());


    }
}
