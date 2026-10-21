import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class 最后作业_练习7_计算乘积 {
    public static void main(String[] args) {
        //输入两个字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        //转换成数组；
        int arr[]=new int[str.length()];
        int arr1[]=new int[str1.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=str.charAt(i)-'0';
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=str1.charAt(i)-'0';
        }
        //定义存储数组；
        int count=0;
        int x[] = new int [str.length()+str1.length()];
        //开始模拟计算

       /*乘法的计算模式
       1：将一个数的每一位和另一个数的每一位相乘
            **6**6**6**6**
               **6**6**6**
       ———————————————————————————————

                   (3  6)
                 3  6
     ++++++++++++++++++++++++++++++++++
                (3  9) 6
              3  6
     ++++++++++++++++++++++++++++++++++//
             (3  9) 9  6
           3  6
     ++++++++++++++++++++++++++++++++++
          (3  9) 9  9  6
                 3  6
     +++++++++++++++++++++++++++++++++++
           3  9 (13 5) 6
              3  6
     +++++++++++++++++++++++++++++++++++
           3 (13 9) 5  6
           3  6
     ++++++++++++++++++++++++++++++++++
          (7  9) 9  5  6
                                      */
        for (int i=arr.length-1; i >= 0; i--) {
            int n=arr[i];
            for (int j = arr1.length-1; j >= 0; j--) {
                int n1=arr1[j];
                //实际上就是两个个位数相乘，然后与先前分配在数组中的权值按照权重相加
                int sum = n*n1+x[i+j+1]+x[i+j]*10;
                System.out.println(sum+"@@");
                //按照当前权重对先前处理的总和进行处理，得出当前位数对应权值
                x[i+j+1]=sum%10;
                x[i+j]=sum/10;
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"|");
        }
    }
}
