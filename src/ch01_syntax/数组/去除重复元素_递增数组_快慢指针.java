package 数组;

public class 去除重复元素_递增数组_快慢指针 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,5,6,7,8,8,8,9,9,10};
        int sl=0;
        int sf=1;
        //快慢指针运行;
        while(sf<arr.length) {
            if (arr[sl] != arr[sf]) {
                sl++;
                arr[sl] = arr[sf];
            }
            sf++;
            }
        for(int i=0;i<=sl;i++){
            System.out.println(arr[i]+"\t");
        }




    }
}
