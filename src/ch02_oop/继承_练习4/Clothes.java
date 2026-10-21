package 继承_练习4;

public class Clothes extends Goods{
    private String size;
    private String color;

    public Clothes() {
    }

    public Clothes(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void showinfo(){
        System.out.println("name:"+getName()+" price:"+getPrice()+" size:"+size+" color:"+color);
    }
}
