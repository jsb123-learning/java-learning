package 算法题;

import java.util.Scanner;

public class 移除元素 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,4,4,5,5,5,2,5,5,0};
        int count=0;
        //输入一个元素；
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                if(arr[arr.length-1]!=0)
                arr[arr.length-1]=0;
                else
                arr[arr.length-1]=1;
                i--;
                count++;
            }
        }
        for (int i = 0; i < arr.length-count; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

}
