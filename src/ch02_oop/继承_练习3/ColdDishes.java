package 继承_练习3;

public class ColdDishes extends Dishes{
    private int SaveTime;
    public ColdDishes() {
    }

    public ColdDishes(String name, int price, String taste,int SaveTime) {
        super(name, price, taste);
        this.SaveTime = SaveTime;
    }
    @Override
    public void detail() {
        System.out.println("name:"+getName()+" price:"+getPrice()+" taste:"+getTaste()+" SaveTime:"+SaveTime);
    }
}
