package 算法题;

import java.util.Random;
import java.util.Scanner;

public class 大乐透 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //定义前区
        int qian [] = new int [5];
        //定义后区
        int hou [] = new int [2];
        //输入前区
        int red [] = new int [5];
        int blue [] = new int [2];
        System.out.print("前区:");
        for (int i = 0; i < red.length; i++) {
            //输入5个随机数
            red[i] = sc.nextInt(35) + 1;
            //遍历数组比较
            for(int j=0;j<i;j++){
                if(red[i]==red[j]){
                    i--;
                    break;
                }
            }
        }
        //输入后区
        System.out.print("后区:");
        for(int i = 0; i < blue.length; i++){
            blue[i] = sc.nextInt(12) + 1;
            //遍历数组比较
            for(int j=0;j<i;j++){
                if(blue[i]==blue[j]){
                    i--;
                    break;
                }
            }
        }
        ///////
        for (int i = 0; i < qian.length; i++) {
            qian[i] = r.nextInt(35) + 1;
            for(int j=0;j<i;j++){
                if(qian[i]==qian[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < qian.length; i++) {
            System.out.print(qian[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < hou.length; i++) {
            hou[i] = r.nextInt(12) + 1;
            for(int j=0;j<i;j++){
                if(hou[i]==hou[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < hou.length; i++) {
            System.out.print(hou[i] + " ");
        }
        int rednum=0;
        int bulenum=0;
        rednum=count(qian,red);
        bulenum=count(hou,blue);
        ///确定中奖情况；
        switch(rednum){
            case 5:
                switch (bulenum){
                    case 2:
                        System.out.println("中一等奖");
                        break;
                    case 1:
                        System.out.println("中二等奖");
                        break;
                    case 0:
                        System.out.println("中三等奖");
                        break;
                }
                break;
            case 4:
                switch (bulenum){
                    case 2:
                        System.out.println("中三等奖");
                        break;
                    case 1:
                        System.out.println("中四等奖");
                        break;
                    case 0:
                        System.out.println("中五等奖");
                        break;
                }
                break;
            case 3:
                switch (bulenum){
                    case 2:
                        System.out.println("中四等奖");
                        break;
                    case 1:
                        System.out.println("中五等奖");
                        break;
                    case 0:
                        System.out.println("中六等奖");
                        break;
                }
                break;

            case 2:
                switch (bulenum){
                    case 2:
                        System.out.println("中五等奖");
                        break;
                    case 1:
                        System.out.println("中六等奖");
                        break;
                    case 0:
                        System.out.println("没中奖");
                        break;
                }
                break;
            case 1:
                switch (bulenum){
                    case 2:
                        System.out.println("中六等奖");
                        break;
                    case 1:
                        System.out.println("没中奖");
                        break;
                    case 0:
                        System.out.println("没中奖");
                        break;
                }
                break;
            case 0:
                switch (bulenum){
                    case 2:
                        System.out.println("中六等奖");
                        break;
                    case 1:
                        System.out.println("没中奖");
                        break;
                    case 0:
                        System.out.println("没中奖");
                        break;
                }
                break;
        }
    }
    public static int count(int arr[],int arrc[]){
        int count=0;
        for(int i=0;i<arrc.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arrc[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
