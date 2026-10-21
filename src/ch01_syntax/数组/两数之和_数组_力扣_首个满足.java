package 数组;

import java.util.jar.JarEntry;

public class 两数之和_数组_力扣_首个满足 {
    public static void main(String[] args) {
        //设定取值数组，0-10,乱序排列
        //要求：找出数组中两个数，使得它们的和等于目标值。只要第一个
        int arr[] = {1, 0, 2, 4, 3, 5, 6, 7, 9, 8, 10};
        int target = 10;
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        int site = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count > 0)
                break;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    num1 = arr[i];
                    num2 = arr[j];
                    count++;
                    site=j;
                }
            }
            if (count > 0)
                System.out.println(num1 + "+" + num2 + "=" + target+"\t"+"index:"+i+","+ site);
        }

    }
}
