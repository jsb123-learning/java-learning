package 数组;

public class 合并有序数组_力扣 {
    public static void main(String[] args) {
        //arr1:1 3 5 7 9
        //arr2:2 4 6 8 10
        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};
        int arr3[] =new int[arr1.length+arr2.length];
        //定义两个数组的指针
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        //循环arr3长度每一次循环填入一个数字；
            //比较两个数组
            while(p1<arr1.length && p2<arr2.length) {
                if (arr1[p1] > arr2[p2]) {
                    arr3[p3] = arr2[p2];
                    p2++;
                    p3++;
                    //arr2已经遍历完，将arr1剩余元素填入arr3
                    if(p2==arr2.length) {
                        arr3[p3] = arr1[p1];
                        break;
                    }
                } else {
                    arr3[p3] = arr1[p1];
                    p1++;
                    p3++;
                    //arr1已经遍历完，将arr2剩余元素填入arr3
                    if (p1 == arr1.length) {
                        arr3[p3] = arr2[p2];
                        break;
                    }
                }
            }
        for (int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i]+"\t");


    }
}
