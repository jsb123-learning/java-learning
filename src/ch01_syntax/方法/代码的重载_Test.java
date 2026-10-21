package 方法;

public class 代码的重载_Test {
    public static void main(String[] args) {
        int a=1;int b=2; int c=3;
        int sum = getSum(getSum(a,b),c);
        System.out.println(sum);
    }
    public static int getSum(int a,int b){
        return a+b;
    }
}
