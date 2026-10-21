package 继承_练习1;

public class cooker extends worker{
    public cooker() {
    }

    public cooker(int workId, String name, int gain) {
        super(workId, name, gain);
    }

    @Override
    public void work() {
        System.out.println("cooker is cooking");
    }
}
