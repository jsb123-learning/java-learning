package 泛形_ListUtil_泛形方法;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("jsb123");
        list2.add("jsb12");
        list2.add("jsb1");
        ListUtil.addAll(list,list2);
        System.out.println(list);
    }
}
