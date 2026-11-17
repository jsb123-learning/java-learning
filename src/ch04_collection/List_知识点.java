import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class List_知识点 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");list.add("bbb");list.add("ccc");list.add("eee");
        list.add(3,"ddd");
        System.out.println(list);
        //remove & set & get
        list.set(3,list.remove(3));
        System.out.println(list.get(3));
        System.out.println(list);

    }
}
