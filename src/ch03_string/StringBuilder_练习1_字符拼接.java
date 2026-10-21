public class StringBuilder_练习1_字符拼接 {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {1,2,3};
        System.out.println(build(arr));
    }
    public static String  build(int arr[]){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1)
                sb.append(arr[i]+"]");
            else
                sb.append(arr[i]+",");
        }
        String str = sb.toString();
        return str;
    }
}
