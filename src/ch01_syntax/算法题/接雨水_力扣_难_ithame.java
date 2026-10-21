package 算法题;

public class 接雨水_力扣_难_ithame {
    public static void main(String[] args) {
        int[] height = {2,1,0,2,1,0,1,3,2,3,2,3};
        int tamp;
        int left [] = new int [height.length];
        int right [] = new int [height.length];
        int temp=left[left.length-1];
        for (int i = left.length-1; i >= 0; i--) {
            if(height[i]>temp){
                temp=height[i];
            }
                left[i]=temp;
        }
        temp=right[0];
        for (int i = 0; i < right.length; i++) {
            if(height[i]>temp){
                temp=height[i];
            }
                right[i]=temp;
        }
        int sum=0;
        for (int i = 0; i < height.length; i++) {
            if(left[i]<right[i]){
                sum+=left[i];
            }else {
                sum+=right[i];
            }
            sum-=height[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
