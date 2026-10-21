package 数组;

public class 排序_升序 {
    public static void main(String[] args) {
        int arr[]={55,11,22,33,7,6,10};
            int temp;
        //排序；
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }


    }
}
