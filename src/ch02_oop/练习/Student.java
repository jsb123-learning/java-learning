package 练习;

public class Student {
    private String name;
    private int  age;
    //
    public Student(){
        System.out.println("无参构造方法已加载");
    }
    public Student(String name,int age){
        this.name= name;
        this.age= age;
        System.out.println("有参构造方法已加载");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    //
    public void study(){
        System.out.println(name+"在学习");
    }
    public void eat(){
        System.out.println(name+"在吃");
    }
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    //定义一个实例方法，接收一个 Student 对象作为参数
    public void printstu(Student stu){
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
    }

}

