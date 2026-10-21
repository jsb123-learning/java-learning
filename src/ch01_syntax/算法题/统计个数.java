package 算法题;

import java.util.Random;

public class 统计个数 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] =new int [6];
        for(int i=0;i<1000;i++){
            arr[r.nextInt(6)]++;
        }
        for(int i=1;i<arr.length;i++)
            System.out.println(i+"得票数为:"+arr[i]+",得票率为"+arr[i]/10.0+"%");
        System.out.println("弃票数为:"+arr[0]+",弃票率为"+arr[0]/10.0+"%");
        int p=1;
        int max=0;
        for(int i=1;i<arr.length;i++)
            if(max<=arr[i]){
                max=arr[i];
                p=i;
            }
        System.out.println(p+"得票最多");



    }



}
