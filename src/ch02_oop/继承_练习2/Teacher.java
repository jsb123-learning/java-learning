package 继承_练习2;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(int workid, String name) {
        super(workid, name);
    }

    @Override
    public void work() {
        System.out.println("教师正在工作");
    }
}
