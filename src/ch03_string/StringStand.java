public class StringStand {
    private StringStand(){

    }
    public static String method(int a[]){
        String str="";
        //遍历数字;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                str+="["+a[i]+",";
            }else if(i==a.length-1) {
                str += a[i] + "]";
            }else
                str+=a[i]+",";
        }
        return str;
    }
}
