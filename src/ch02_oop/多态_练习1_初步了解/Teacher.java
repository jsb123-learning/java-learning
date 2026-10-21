package 多态_练习1_初步了解;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int id, int passwd) {
        super(name, id, passwd);
    }

    @Override
    public void work() {
        System.out.println("teach");
    }
}
