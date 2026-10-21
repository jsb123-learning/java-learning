package 高级语法;

import java.awt.print.Printable;

public class 平行四边形 {
    public static void main(String[] args) {
        for(int i =1;i<=3;i++){
            for( int j=1;j<=3-i;j++)
                System.out.print(" ");
            for(int j=1;j<=5;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
