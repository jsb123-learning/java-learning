import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_迭代器列表_遍历集合 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            int i = it.next();
            if(3==i){
                it.add(3);
            }
            System.out.println(i);
        }
        System.out.println(list);
    }
}
