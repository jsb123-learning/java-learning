package 数组;

public class 寻找最大值 {
    public static void main(String[] args) {
        //设置数组
        int arr[] = {33,5,22,44,55};
        //设置最大中间值
        int max =arr[0];
        //进入循环查找数组；
        for(int i=1;i<arr.length;i++){
            //比较；
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值是"+ max);
    }
}
