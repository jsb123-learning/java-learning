import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class System_知识点 {
    public static void main(String[] args) {
        //System.exit终止当前运行的Java虚拟机
        //0:正常终止    非0：异常终止；
        System.out.println("1111");
        //System.exit(0);
        System.out.println("2222");

        //System.currentTimeMillis()返回当前的系统时间（ms）
        //从1970年1月1日 8：0：0 -----》当前时间
        long l = System.currentTimeMillis();
        System.out.println(l);

        //System.arraycopy() 拷贝数组
        //原数组
        int arr1[]= {1,2,3,4,5,6,7,8,9,10};
        //目标数组
        int arr2[] = new int[arr1.length];
        System.arraycopy(arr1,3,arr2,5,4);
        System.out.println(Arrays.toString(arr2));
    }
}
