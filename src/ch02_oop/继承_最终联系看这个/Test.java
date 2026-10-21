package 继承_最终联系看这个;

public class Test {
    public static void main(String[] args) {
        //创建一个bStudent对象
        bStudent bs = new bStudent("张三", 18, "本科");
        System.out.println(bs.getName()+","+bs.getAge()+","+bs.getGarde());
        bs.sleep();
        bs.eat();
        bs.study();
        //创建一个sStudent对象
        sStudent ss = new sStudent("李四", 18, "硕士");
        ss.study();
        ss.sleep();
        //创建一个tTeacher对象
        tTeacher tt = new tTeacher("王五", 18, "数学");
        tt.teach();
        //创建一个zTeacher对象
        zTeacher zt = new zTeacher("赵六", 18, "编程");
        zt.teach();
    }
}
