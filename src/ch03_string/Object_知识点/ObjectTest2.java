package Object_知识点;

public class ObjectTest2 {
    public static void main(String[] args) {
        Student s = new Student("jsb123",23);
        Student s1 = new Student("jsb123",23);
        boolean b =s.equals(s1);
        System.out.println(b);
    }
}
