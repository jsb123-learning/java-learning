import java.util.ArrayList;
import java.util.List;

public class List_增强for_遍历集合 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
