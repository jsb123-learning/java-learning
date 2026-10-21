package 继承_练习2;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(int workid, String name) {
        super(workid, name);
    }

    @Override
    public void work() {
        System.out.println("购买人员正在工作");
    }
}
