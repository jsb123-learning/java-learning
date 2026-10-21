package 继承_练习3;

public class Dishes {
    private String name;
    private int price;
    private String taste;

    public Dishes() {
    }

    public Dishes(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public void detail(){
        System.out.println("name:"+name+" price:"+price+" taste:"+taste);
    }
}
