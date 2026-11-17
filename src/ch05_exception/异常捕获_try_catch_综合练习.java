public class 异常捕获_try_catch_综合练习 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        try {
            System.out.println(arr[10]);
            System.out.println(10/0);
        }catch (ArrayIndexOutOfBoundsException  | ArithmeticException a){
            a.printStackTrace();
        }
        System.out.println("123");
    }
}
