public class StringBuilder_append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long start =System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            sb.append("abc");
        }
        long end =System.currentTimeMillis();
        System.out.println("time:"+ (end-start));
    }
}
