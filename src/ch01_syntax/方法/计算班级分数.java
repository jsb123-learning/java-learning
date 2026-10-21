package 方法;

import java.util.Scanner;

public class 计算班级分数 {
    public static void main(String[] args) {
        int a[] =new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个学生成绩：");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
            while(a[i]<0||a[i]>100){
                System.out.println("输入错误，请重新输入：");
                a[i]=sc.nextInt();
            }
        }
        //求及格人数；
        int passBody=pass(a);
        System.out.println("及格人数为："+passBody);
        //求及格率
        double passRate=passBody*1.0/a.length*100;
        System.out.println("及格率为："+passRate+"%");
        //求总分
        int allpoints=all(a);
        System.out.println("总分为："+allpoints);
        //求平均分
        double average=allpoints*1.0/a.length;
        System.out.println("平均分为："+average);
        //找找最大值
        int maxPoint=max(a);
        System.out.println("最大值为："+maxPoint);
    }
    public static int  pass(int a[]){
        int count=0;;
        for(int i=0;i<a.length;i++){
            if(a[i]>=60){
                count++;
            }
        }
        return count;
    }
    public static int all(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;

   }
    public static int max(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
}
