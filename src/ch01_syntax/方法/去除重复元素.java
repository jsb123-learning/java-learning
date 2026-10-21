package 方法;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Random;

public class 去除重复元素 {
    //定义主方法
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        //生成随机数
        for(int i=0;i<arr.length;) {
            int num =r.nextInt(100);
            //判断数组之前是否存在相同的元素
            boolean flag = only(arr,num);
                if(flag){
                    arr[i]=num;
                    i++;
                }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //定义方法
    public static Boolean only(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return false;
            }
        }
        return true;
    }
}
