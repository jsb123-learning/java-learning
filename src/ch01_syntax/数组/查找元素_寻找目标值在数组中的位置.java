package 数组;

import java.util.Scanner;

public class 查找元素_寻找目标值在数组中的位置 {
    public static void main(String[] args) {
        //定义数组
        int arr[]={1,3,5,6};
        int count=0;
        //用户输入目标值;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标值:");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=target){
                System.out.println("目标值在数组中的位置是:"+i);
                break;
            }
            count++;
        }
        if(count==arr.length) System.out.println("目标值在数组中的位置是"+arr.length);
    }
}
