import java.util.TreeSet;

public class 综合练习_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts =new TreeSet<>();
        ts.add(1);
        ts.add(4);
        ts.add(5);
        ts.add(3);
        ts.add(2);
        System.out.println(ts);
        for (Integer t : ts) {
            System.out.println(t);
        }
        ts.forEach(i-> System.out.println(i));
        ts.forEach(System.out::println);
    }
}
