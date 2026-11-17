public class 递归练习_猴子吃桃 {
    public static void main(String[] args) {
        System.out.println(eat(1));
    }
    public static  int eat(int day){
        if(day==10){
            return 1;
        }
        return (eat(day+1)+1)*2;
    }
}
