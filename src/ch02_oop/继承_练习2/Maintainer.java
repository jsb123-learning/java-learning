package 继承_练习2;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(int workid, String name) {
        super(workid, name);
    }

    @Override
    public void work() {
        System.out.println("维护人员正在工作");
    }
}
