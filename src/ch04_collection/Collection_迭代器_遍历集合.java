import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection_迭代器_遍历集合 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aaa");al.add("bbb");al.add("ccc");
        al.remove("bbb");
        System.out.println(al);
        /*Iterator<String> it = al.iterator();
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(al);*/
    }
}
