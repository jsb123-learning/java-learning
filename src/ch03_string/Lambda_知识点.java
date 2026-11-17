import java.util.Arrays;
import java.util.Comparator;

public class Lambda_知识点 {
    public static void main(String[] args) {
        Integer[] arr ={2,3,1,5,6,7,8,4,9};
        Arrays.sort(arr, (integer,t1)->
                 t1-integer
        );
        System.out.println(Arrays.toString(arr));
    }
}
