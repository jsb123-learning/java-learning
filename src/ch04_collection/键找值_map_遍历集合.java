import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 键找值_map_遍历集合 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("J",11);
        m.put("Q",12);
        m.put("K",13);
        //获取所有的键，把这些键放到一个单列集合当中
        Set<String> s  = m.keySet();
        //遍历单列集合，得到每一个键
        /*for (String string : s) {
            System.out.println(string);
            //利用map集合中的键获取对应的值
            System.out.println(m.get(string));
        }

        Iterator<String> i = s.iterator();
        while(i.hasNext()){
            String value = i.next();
            System.out.println(value);
            //利用map集合中的键获取对应的值
            System.out.println(m.get(value));

         */
        s.forEach(value->{
            System.out.println(value);
            System.out.println(m.get(value));
        });
    }
}
