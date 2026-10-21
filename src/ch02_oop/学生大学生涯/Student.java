package 学生大学生涯;

public class Student {
    private String name;
    private int age;
    private double height;
    private double weight;
    //姓名setget
    public void setName(String name){
       this. name  = name;
    }
    public String getName(){
        return name;
    }
    //年龄
    public void setAge(int num){
        age=num;
    }
    public int getAge(){
        return age;
    }
    //身高
    public void setHeight(double num){
        height=num;
    }
    public double getHeight(){
        return height;
    }
    //体重
    public void setWeight(double num){
     weight=num;
    }
    public double getWeight(){
        return weight;
    }
    public void study(){
        System.out.println("学生正在学习");
    }
}
