package 数组;

import java.util.Scanner;

public class 查找数据{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义数组
        int arr[] = {1,2,3,4,5,6};
        int mid =0;
        //录入数据；
        System.out.println("请输入要查找的数据：");
        int find =sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                System.out.println("找到数据"+find+"在数组中的索引是"+i);
                mid++;
                break;
            }

        }
        if(mid==0) System.out.println("没有找到数据");


    }
}
