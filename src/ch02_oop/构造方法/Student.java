package 构造方法;

public class Student {
     private String name;
    private  int age;
    private  char sex;
    public Student() {
        System.out.println("无参构造方法被调用");
    }
    public Student(String name,int age,char sex) {
        this.name =name;
        this.age=age;
        this.sex=sex;
        System.out.println("有参构造方法被调用");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
