package 数组;

import java.util.Random;

public class 去除重复的随机数_myself {
    public static void main(String[] args) {
        int arr[] =new int[10];
        Random r = new Random();
        //开是存入数字
        for(int i=0;i<arr.length;i++) {
            arr[i] = r.nextInt(100);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    arr[i] = r.nextInt(100);
                    j = 0;
                }
            }

            System.out.println(arr[i] + "\t");
        }

        }
    }

