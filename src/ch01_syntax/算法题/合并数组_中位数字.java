package 算法题;

public class 合并数组_中位数字 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10,12,14};
        int[] arr3 = new int[arr1.length + arr2.length];
        //设定三
        int p3=0;
        int p1 =0;
        int p2 =0;
        while(p1<arr1.length && p2<arr2.length ){
            if(arr1[p1]<arr2[p2]){
                arr3[p3]=arr1[p1];
                p1++;
            }else {
                arr3[p3]=arr2[p2];
                p2++;
            }
            p3++;
        }
        while(p1<arr1.length){
            arr3[p3]=arr1[p1];
            p1++;
            p3++;
        }
        while (p2<arr2.length){
            arr3[p3]=arr2[p2];
            p2++;
            p3++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        if(arr3.length%2==0){
            System.out.println((arr3[arr3.length/2]+arr3[arr3.length/2-1])/2.0);
        }else {
            System.out.println(arr3[arr3.length/2]);
        }
    }
}
