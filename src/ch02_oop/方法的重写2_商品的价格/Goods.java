package 方法的重写2_商品的价格;

public class Goods {
    private double price;
    private String name;
    public Goods() {
    }
    public Goods(double price, String name) {
        this.price = price;
        this.name = name;
    }
    //方法；
    public double discount() {
        if (price < 1000) {
            price = price ;
        } else if (price >= 1000 && price < 5000) {
            price = price * 0.9;
        } else if (price >= 5000 && price < 10000) {
            price = price * 0.8;
        } else if (price >= 10000) {
            price = price * 0.7;
        }
        return price;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
