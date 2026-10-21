package 数组;

import java.util.Random;

public class 去除重复随机数_ithema {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] =new int[10];

        int num;
        //进入循环；
        for (int i=0;i<arr.length;){
            //计数器；
            int count = 0;
             num =r.nextInt(100);
            for(int j=0;j<i;j++){
                //判断、
                if(arr[j]==num){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr[i]=num;
                i++;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
