package 继承_练习5;

public class slow extends Normal {
    public slow() {
    }

    public slow(String id, int weight, String receiver) {
        super(id, weight, receiver);
    }
    public int money(){
        return super.money() +15;
    }
}
