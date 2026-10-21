package 数组;

public class 索引边界检查 {
    public static void main(String[] args) {
        //定义数组；
        int arr [] = {1,2,3,4,5,6};
        int index= 10;
        if(index>=0 && index<arr.length){
            System.out.println(arr[index]);
        }else{
            System.out.println("索引越界"+"数组长度是"+arr.length);
        }
    }
}
