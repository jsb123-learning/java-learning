package 继承_练习5;

public class fast extends Normal{
    public fast() {
    }

    public fast(String id, int weight, String receiver) {
        super(id, weight, receiver);
    }
    public int money(){
        return super.money() +10;
    }
}
