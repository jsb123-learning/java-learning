import javax.print.CancelablePrintJob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection_知识点 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("A");
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);
        coll.add("A");
        coll.add("b");coll.add("c");
        coll.remove("b");
        System.out.println(coll);
        System.out.println(coll.contains("A"));
        System.out.println(coll.size());
    }
}
