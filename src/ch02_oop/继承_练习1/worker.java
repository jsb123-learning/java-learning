package 继承_练习1;

public class worker {
    private int workId;
    private String name;
    private int gain;

    public worker() {
    }

    public worker(int workId, String name, int gain) {
        this.workId = workId;
        this.name = name;
        this.gain = gain;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    public void work() {
        System.out.println("worker is working");
    }
    public void eat() {
        System.out.println("worker is eating");
    }
}
