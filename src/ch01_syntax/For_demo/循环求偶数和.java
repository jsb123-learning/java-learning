package For_demo;

public class 循环求偶数和 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i=i+2) {
             sum = sum + i;
        }
        System.out.println("1到100的偶数和为：" + sum);
    }
}
