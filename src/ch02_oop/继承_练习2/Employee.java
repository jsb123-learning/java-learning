package 继承_练习2;

public class Employee {
    private int  workid;
    private String name;

    public Employee() {

    }

    public Employee(int workid, String name) {
        this.workid = workid;
        this.name = name;
    }

    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void work(){
        System.out.println("员工正在工作");
    }
}
