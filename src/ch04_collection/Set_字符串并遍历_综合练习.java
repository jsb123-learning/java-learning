import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_字符串并遍历_综合练习 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("jsb123");
        s.add("jsb12");
        s.add("jsb1");
        /*迭代器
        Iterator<String> iter = s.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

         增强for
        for(String s1 :s){
            System.out.println(s1);
        }
         lambda
        s.forEach(s1->System.out.println(s1));
         */
        s.forEach(System.out::println);
    }
}
