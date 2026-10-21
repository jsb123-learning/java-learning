package 方法;

import java.awt.print.Printable;
import java.security.PublicKey;

public class 遍历数组 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            //遍历插件；
            mathod(i,arr.length);
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
    public static int mathod(int i,int length){
        if(i==0){
            System.out.print("[");
        }else if(i==length){
            System.out.print("]");
        }else{
            System.out.print(",");
        }
        return 0;
    }
}
