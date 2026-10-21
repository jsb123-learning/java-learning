package 继承_练习2;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int workid, String name) {
        super(workid, name);
    }

    @Override
    public void work() {
        System.out.println("讲师正在工作");
    }
}
