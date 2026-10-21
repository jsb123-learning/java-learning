package 方法;

import java.util.Random;

public class 去除重复元素_Test {
    //定义主方法
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        //生成随机数
        for(int i=0;i<arr.length;) {
            arr[i] =r.nextInt(100);
            //判断数组之前是否存在相同的元素
            int p =i;
                if(only(arr,p,arr[i])) {
                    i++;
                }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //定义方法
    public static Boolean only(int arr[],int p,int num){
        for(int i=0;i<p;i++){
            if(arr[i]==num){
                return false;
            }
        }
        return true;
    }
}
