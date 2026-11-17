import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 键值对_map_遍历集合 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("J",11);
        m.put("Q",12);
        m.put("K",13);
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        /*
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Iterator<Map.Entry<String,Integer>> i = entries.iterator();
        while(i.hasNext()){
            System.out.println(i.next().getKey());
            System.out.println(i.next().getValue());
        }
         */

        }
    }

