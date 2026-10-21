package 继承_self;

public class Person {
     String name;
     int age;
     String sex;
    public void Person(){

    }
    public void Person(String name,int age,String sex){

    }
    public void setName(String name){
        this.name=name;
    }
    public String gerName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int setAge(){
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //成员方法
    public void  eat(){
        System.out.println(name+"在吃");
    }
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
}
