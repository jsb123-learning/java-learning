package 多态_练习2_人与交通工具;

public class Transportation {
    private String logo;
    private int speed;

    public Transportation(String logo, int speed) {
        this.logo = logo;
        this.speed = speed;
    }

    public Transportation() {
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void move() {
        System.out.println(this.logo+"move");
    }
}
