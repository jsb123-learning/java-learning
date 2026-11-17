import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.*;
import java.nio.file.attribute.AclEntryPermission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Collection_lambda_遍历集合 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("jsb");
        coll.add("sjb");
        coll.add("bjs");
        //利用匿名内部类的方式进行遍历
        /*coll.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合中的每一个数据；
            //
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //利用lambda表达式
        coll.forEach(System.out::println);
    }
}
