package 多态_练习3_学生图形;

public class Student {
    String name;
    int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void usePic(Pic p){
        System.out.println(p.a+" "+p.b+" "+p.zc()+" "+p.area());
    }

}
