package 继承_练习3;

public class HotDishes extends Dishes{
    private int CookTime;

    public HotDishes() {
    }

    public HotDishes(String name, int price, String taste, int cookTime) {
        super(name, price, taste);
        CookTime = cookTime;
    }

    public int getCookTime() {
        return CookTime;
    }

    public void setCookTime(int cookTime) {
        CookTime = cookTime;
    }
    public void detail(){
        System.out.println("name:"+getName()+" price:"+getPrice()+" taste:"+getTaste()+" CookTime:"+CookTime);
    }
}
