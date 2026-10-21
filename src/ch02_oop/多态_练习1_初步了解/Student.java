package 多态_练习1_初步了解;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int id, int passwd) {
        super(name, id, passwd);
    }

    @Override
    public void work() {
        System.out.println("study");
    }
}
