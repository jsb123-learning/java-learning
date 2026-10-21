package 继承_练习2;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(int workid, String name) {
        super(workid, name);
    }

    @Override
    public void work() {
        System.out.println("管理员正在工作");
    }
}
