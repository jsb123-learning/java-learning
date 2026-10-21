package 方法;

import java.util.regex.PatternSyntaxException;

public class 乘法表 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                ji(i,j);
            }
        }


    }
    //
    public static  void  ji(int i,int j){
        System.out.print(i+"*"+j+"="+i*j+"\t");
        if(i==j)  System.out.println();
    }
}
