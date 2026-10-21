package 继承_练习5;

public class Normal {
    private String id;
    private int weight;
    private String receiver;

    public Normal() {
    }

    public Normal(String id, int weight, String receiver) {
        this.id = id;
        this.weight = weight;
        this.receiver = receiver;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public int  money(){
        return weight * 10;
    }
}
