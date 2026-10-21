package 高级语法;

public class 打印梯形 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=i;j<3;j++)
                System.out.print(" ");
            for(int j=-i;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
