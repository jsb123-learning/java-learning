package 多态_练习3_学生图形;

public class Tesr {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", 18);
        Pic p = new Square(10, 20);
        s.usePic(p);
        Pic p2 = new Round(3.14, 2);
        s.usePic(p2);
    }
}
