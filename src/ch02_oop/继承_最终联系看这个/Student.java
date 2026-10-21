package 继承_最终联系看这个;

public class Student extends Person{
    private String garde;
    public Student() {
    }
    public Student(String name, int age, String garde){
        super(name, age);
        this.garde = garde;
    }

    public String getGarde() {
        return garde;
    }

    public void setGarde(String garde) {
        this.garde = garde;
    }

    //行为;
    public void study() {
        System.out.println("学生"+getName()+"在攻读" + garde + "学位");
    }
}
