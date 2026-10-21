package 数组;

import java.util.Scanner;

public class 有序数组二分法查找 {
    public static void main(String[] args) {
        //定义一个有序数组；
        int arr[] = {1, 3, 5, 7, 9,11,13,15,17,19,21};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int num = sc.nextInt();
        int min = 0;
        int max= arr.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(arr[mid]==num){
                System.out.println("找到数字"+num+"在数组中的位置是："+mid);
                break;
            }else if(arr[mid]<num){
                min=mid+1;
            }else{
                max=mid-1;
            }
            if(min>max) System.out.println("没有找到");
        }
    }
}
