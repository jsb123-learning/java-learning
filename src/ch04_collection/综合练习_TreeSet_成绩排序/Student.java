package 综合练习_TreeSet_成绩排序;

public class Student {
    private String name;
    private int age;
    private  int language;
    private  int math;
    private int english;

    public Student() {
    }

    public Student(String name, int age, int language, int math, int english) {
        this.name = name;
        this.age = age;
        this.language = language;
        this.math = math;
        this.english = english;
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

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", language=" + language +
            ", math=" + math +
            ", english=" + english +
            ",总分=" +(this.language+this.math+this.english)+
            '}';
    }
}
