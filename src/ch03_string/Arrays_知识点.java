import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Arrays_知识点 {
    public static void main(String[] args) {
        //拼接数组
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        String str = Arrays.toString(arr);
        System.out.println(str);

        //二分法查找元素
        System.out.println(Arrays.binarySearch(arr, 5));

        //拷贝数组
        int arr1[] = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr1));

        //拷贝数组（制定范围）
        arr1 = Arrays.copyOfRange(arr, 1, 5);
        System.out.println(Arrays.toString(arr1));

        //填充数组
        Arrays.fill(arr1, 0);
        System.out.println(Arrays.toString(arr1));

        //数组排序,顺序数组直接用
        //逆序需要将基本类型的数据包装成对象，
        Integer arr3[] = {2, 1, 4, 7, 5, 9, 8, 3, 6};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                System.out.println("_________________");
                System.out.println("o1:"+integer);
                System.out.println("o2:"+t1);
                return t1-integer;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
