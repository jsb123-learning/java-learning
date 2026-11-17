import java.util.*;

public class 综合练习_Collections_知识点 {
    public static void main(String[] args){
        List<String> al = new ArrayList<>();
        Collections.addAll(al,"1","2","3","4","5");
        for (String s : al) {
            System.out.print(s);
        }
        System.out.println();
        Collections.shuffle(al);
        System.out.println(al);
        Collections.sort(al,(a1,a2)->{
           return a2.compareTo(a1);
        });
        System.out.println(al);
        Collections.sort(al);
        System.out.println(Collections.binarySearch(al, "5"));
        List<String> al1 = new ArrayList<>();
        Collections.addAll(al1,"1","1","1","1","1","1");
        Collections.copy(al1,al);
        System.out.println(al1);
        Collections.fill(al,"s");
        System.out.println(al);
        Collections.swap(al1,0,4);
        System.out.println(al1);
    }
}
