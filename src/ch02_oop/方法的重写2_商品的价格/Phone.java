package 方法的重写2_商品的价格;

public class Phone extends Goods{
    //类中默认有一空参构造
    //public Phone() {
    //super(); 并默认调用了父类的构造方法;
    //}
    //所以Phone能使用空参创建对象；
    @Override
    public double discount() {
        return super.discount()*0.9;
    }
}
