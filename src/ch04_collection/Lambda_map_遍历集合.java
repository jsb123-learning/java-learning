import java.util.HashMap;
import java.util.Map;

public class Lambda_map_遍历集合 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("J",11);
        m.put("Q",12);
        m.put("K",13);
        m.forEach((String key, Integer value)->{
            System.out.println(key);
            System.out.println(value);
        });
    }
}
