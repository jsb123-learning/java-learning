import java.util.Arrays;

public class 综合练习_可变参数_练习 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
    }
    public static int sum(int...num){
        int all = 0;
        for (int i : num) {
            all+=i;
        }
        return all;
    }
}
