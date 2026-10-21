package 方法;

import java.util.Scanner;
import java.util.logging.Level;

public class 评为打分 {
    public static void main(String[] args) {
        int arr[] =new int [5];
        int sum=0;
        //键盘录入五个数字进数组中
        for(int i=0;i<5;i++){
            arr[i]=points();
             sum=sum+arr[i];
        }
        //找到最大值最小值；
        sum-=max(arr);
        sum-=min(arr);
        //求平均值
        System.out.println("平均分是："+sum/3);

    }
    public static int points(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int point = sc.nextInt();
        while(point < 0 || point > 100){
            System.out.println("输入的数字无效，请重新输入：");
            point = sc.nextInt();

        }
        return point;
    }
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
