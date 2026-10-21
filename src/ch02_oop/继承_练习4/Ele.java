package 继承_练习4;

public class Ele extends Goods{
    private String logo;
    private String type;

    public Ele() {
    }

    public Ele(String name, double price, String logo, String type) {
        super(name, price);
        this.logo = logo;
        this.type = type;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void showinfo(){
        System.out.println("name:"+getName()+" price:"+getPrice()+" logo:"+logo+" type:"+type);
    }
}
