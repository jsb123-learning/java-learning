package Special_Test;

import java.util.Scanner;

public class 数位至和_牛客 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            n=n*-1;
        }
        int count = 0;
        while(n>0){
            count += n % 10;
            n = n / 10;
        }
        System.out.println(count);

    }
}
