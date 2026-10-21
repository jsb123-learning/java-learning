package 算法题;

import java.util.Scanner;

public class 移除元素_双指针 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,4,4,5,5,5,2,5,5,0};
        int pl=0;
        int pf=0;
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        while(pf<arr.length){
            if(arr[pf]!=num){
                arr[pl]=arr[pf];
                pl++;
            }
            pf++;
        }
        for (int i = 0; i < pl; i++) {
            System.out.print(arr[i]+"\t");

        }
    }
}
