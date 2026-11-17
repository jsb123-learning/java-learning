import java.util.HashMap;
import java.util.Map;

public class 知识点_map {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();

        //put
        m.put("j",11);
        m.put("q",12);
        System.out.println(m.put("k", 13));
        System.out.println(m);

        /*remove;
        m.remove("k");
        System.out.println(m);

        //clear
        m.clear();
        System.out.println(m);
         */

        //containsKey
        boolean b = m.containsKey("l");
        System.out.println(b);

        //containsValue
         b = m.containsValue(12);
        System.out.println(b);

        //m.clear();
        //isEmpty
        b=m.isEmpty();

        //size
        System.out.println(m.size());
    }
}
