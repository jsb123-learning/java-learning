import java.util.Comparator;
import java.util.TreeMap;

public class 综合练习_TreeMap_价格排序 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>((t1,t2)->{
            return t2-t1;
        });
        tm.put(1,"olo");
        tm.put(2,"lss");
        tm.put(3,"cccl");
        tm.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });
    }
}
