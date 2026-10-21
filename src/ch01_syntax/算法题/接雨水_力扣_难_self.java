package 算法题;

public class 接雨水_力扣_难_self {
    public static void main(String[] args) {
        int[] height = {5, 3, 4};
        //定义指针，指向筒边；
        int left = 0;
        int right =1;
        int sum=0;
        int other=0;
        //遍历数组寻找同边；
        for(int i=0; i<=height.length-1; i++){
            //边界即停；
            if(i==height.length-1&&height[i]>height[i-1]){
                right=i;
                System.out.println(left+" "+right);
                //计算其中的节水量
                other=0;
                if(height[left]<height[right]){
                    for(int k=left+1; k<right; k++)
                        other+=height[k];
                    sum+=(right-left-1)*height[left]-other;
                }else {
                    for(int k=left+1; k<right; k++)
                        other+=height[k];
                    sum+=(right-left-1)*height[right]-other;
                }
                System.out.println(sum);
                break;
            }else if(i==height.length-1) break;
            //寻找左指针
            if(i==0&&height[i]>height[i+1]){
                left=i;
                //从左指针开始向右边开始寻找下一个边
                for(int j=left+1; j<height.length-1; j++){
                    if (height[j]>height[j-1]&&height[j]>height[j+1]){
                        right=j;
                        System.out.println(left+" "+right);
                        //计算其中的节水量
                        other=0;
                        if(height[left]<height[right]){
                            for(int k=left+1; k<right; k++)
                                other+=height[k];
                            sum+=(right-left-1)*height[left]-other;
                        }else {
                            for(int k=left+1; k<right; k++)
                                other+=height[k];
                            sum+=(right-left-1)*height[right]-other;
                        }
                        System.out.println(sum);
                        break;
                    }
                }
            }
            if(i!=0&&height[i]>height[i+1]&&height[i]>=height[i-1]){
                left=i;
                //从左指针开始向右边开始寻找下一个边
                for(int j=left+1; j<height.length-1; j++){
                    if (height[j]>height[j-1]&&height[j]>height[j+1]){
                        right=j;
                        System.out.println(left+" "+right);
                        //计算其中的节水量
                        other=0;
                        if(height[left]<height[right]){
                            for(int k=left+1; k<right; k++)
                                other+=height[k];
                            sum+=(right-left-1)*height[left]-other;
                        }else {
                            for(int k=left+1; k<right; k++)
                                other+=height[k];
                            sum+=(right-left-1)*height[right]-other;
                        }
                        System.out.println(sum);
                        break;
                    }
                }

            }

        }
    }
}
