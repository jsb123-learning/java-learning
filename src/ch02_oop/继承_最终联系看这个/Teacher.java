package 继承_最终联系看这个;

public class Teacher extends Person{
    private String major;

    public Teacher() {

    }

    public Teacher(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public  void teach(){
        System.out.println("老师"+getName()+"正在教" + major);
    }
}
