import java.util.ArrayList;
import java.util.List;

public class List_lambda_遍历集合 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.forEach(i-> System.out.println(i));
        //额外知识引用方法
        list.forEach(System.out::println);
    }
}
