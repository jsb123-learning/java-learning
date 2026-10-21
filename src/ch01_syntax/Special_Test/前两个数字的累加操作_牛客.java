package Special_Test;

public class 前两个数字的累加操作_牛客 {
    public static void main(String[] args) {
        int sum=0;
        int temp1=0;
        int temp2=1;
        for(int i=3;i<=10;i++){
            sum=temp2+temp1;
            temp1=temp2;
            temp2=sum;
            System.out.println(sum);
            }
        }
    }

