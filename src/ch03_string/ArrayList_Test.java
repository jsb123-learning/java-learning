import java.util.ArrayList;
import java.util.List;

public class ArrayList_Test {
    public static void main(String[] args) {
        //普通类型；
        //ArrayList al = new ArrayList();
        //泛型；
        ArrayList<String> al =new ArrayList<>();
        al.add("abc123");
        al.remove(0);
        //al.add(123); xxxx只能存储对应类型的数据；

        //添加数据；
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add(0,"qqq");
        System.out.println(al);
        //删除
        al.remove("aaa");
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        //修改
        al.set(0,"aaa");
        System.out.println(al);
        //查看
        System.out.println(al.get(0)+" "+al.size());
    }
}
