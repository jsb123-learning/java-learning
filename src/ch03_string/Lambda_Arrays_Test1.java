import java.util.Arrays;

public class Lambda_Arrays_Test1 {
    public static void main(String[] args) {
        String arr[]={"1","22","4444","333","7777777","55555","666666"};
        Arrays.sort(arr,(integer,t1)-> integer.length()-t1.length()
        );
        System.out.println(Arrays.toString(arr));
    }
}
