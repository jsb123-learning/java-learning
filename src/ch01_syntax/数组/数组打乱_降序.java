package 数组;

import java.util.Random;

public class 数组打乱_降序 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        Random r = new Random();
        int temp;
        for(int i=0;i<arr.length;i++){
            int mid = r.nextInt(0,arr.length);
            while(i==mid){
                mid = r.nextInt(0,arr.length);
            }
            temp=arr[i];
            arr[i]=arr[mid];
            arr[mid]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //降序排序；
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
    }

}
