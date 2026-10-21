package 工具类;

import java.security.PrivateKey;

public class ArrayUitl {
    //工具类一般只提供静态方法，无需或者不希望被用来创造对象占用内存堆空间
    private ArrayUitl() {}
    //因为没有加载对象，若不是静态，被测试调用时则无法找到相关成员方法信息
     public static  void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
     public static double getAverage(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum*1.0/arr.length;
    }
}
