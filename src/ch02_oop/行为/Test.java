package 行为;

public class Test {
    public static void main(String[] args) {
        Teacher t= new Teacher();
        t.name="张三";
        t.age=30;
        System.out.print("my name is "+t.name+" and my age is "+t.age+"\t");
        t.teach();
        t.eat();
        t.sleep();
        Cooker c =new Cooker();
        c.name="老张";
        c.age=40;
        c.level=5;
        System.out.print("my name is "+c.name+" and my age is "+c.age+" and my level is "+c.level+"\t");
        c.cook();
        Worker w =new Worker();
        w.name="davalysph";
        w.age=20;
        w.year=10;
        System.out.print("my name is "+w.name+" and my age is "+w.age+" and my year is "+w.year+"\t");
        w.work();
    }
}
