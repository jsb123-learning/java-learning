public class 递归练习_爬楼梯 {
    //台阶联系速记：
    //上台阶的方法总和=（前一个台阶方法+1步）+（前二个台阶方法+2步）拓展：规则内允许有几种上楼梯方法就可以延伸到多少；
    public static void main(String[] args) {
        System.out.println(countTemp(20));
    }
    public static int countTemp(int level){
        if(level==1)
            return 1;
        if (level==2)
            return 2;
        if (level==3)
            return 4;
        int a=1,b=2,c=4;
        for(int i=4;i<=level;i++){
           int sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return c;
        //return countTemp(level-1)+countTemp(level-2)+countTemp(level-3);
    }
}
