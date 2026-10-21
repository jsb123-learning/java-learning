package 数组;

public class 两数之和_数组_力扣_所有满足 {
    public static void main(String[] args) {
        //设定取值数组，0-10,乱序排列
        int arr[]={1,0,2,4,3,5,6,7,9,8,10};
        int target= 10;
        int num1=0;
        int num2=0;
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==10){
                    num1=arr[i];
                    num2=arr[j];
                    count++;
                }
            }
            if(count>0)
            System.out.println(num1+"+"+num2+"=10");
        }
    }
}
