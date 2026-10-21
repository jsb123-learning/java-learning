package 数组;

import java.util.Scanner;

public class 动态初始化 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]+"\t");
    }
}
