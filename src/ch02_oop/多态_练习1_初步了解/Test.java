package 多态_练习1_初步了解;

public class Test {
    public static void main(String[] args) {
        //多态是一种java的特性，而不是特指某项功能
        //多态成立的三个前提：①继承(或实现) ②方法重写 ③父类引用指向子类对象
        Admin man = new Admin("manager",1,1);
        register(man);
        Student stu =new Student("student",2,2);
        register(stu);
        //列入这里，我们将teacher实列定义成Person类型,也可以正常使用
        //ai批注：// Person per = new Teacher(...) 这叫【向上转型】(自动发生)
        // 左边是编译类型(Person)，右边是运行类型(Teacher)
        // 规则：成员变量/静态方法看左边，实例方法看右边 —— 所以 per.work() 调用的是 Teacher 类的 work()
        Person per = new Teacher("techear",3,3);
        register(per);
    }

    //例如这里，形参虽然是Person类型的，当外部参数传输进来时，依旧不会冲突
    public static void register(Person per){
        System.out.println(" name；"+per.getName()+" id:"+per.getId()+" passwd:"+per.getPasswd());
        per.work();
    }
}
