package 高级语法;

public class 打印99乘法表 {
    public static void main(String[] args) {
        //主循环共9行；
        for(int i=1;i<=9;i++){
            //副循环等于列数，依据主循环；
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");

            }
            System.out.println();

        }
    }
}
