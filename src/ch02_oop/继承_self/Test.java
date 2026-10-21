package 继承_self;

public class Test {
    public static void main(String[] args) {
        //
        Student stu = new Student();
        stu.name="xss";
        stu.age=19;
        stu.grade="一年级";
        System.out.println(stu.name+"\t"+stu.age+"\t"+stu.grade);
        stu.eat();
        stu.study();
        //
        Teacher tea = new Teacher();
        tea.name=("jin");
        tea.age=(22);
        tea.major=("computer");
        System.out.println(tea.name+"\t"+tea.age+"\t"+tea.major);
        tea.eat();
        tea.teach();
    }
}
