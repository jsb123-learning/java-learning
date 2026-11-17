import java.util.*;

public class 综合练习_HashMap_统计人数 {
    public static void main(String[] args) {
        Random r = new Random();
        HashMap<Integer,Character>  mp = new HashMap<>();
        for (int i = 1; i <= 80; i++) {
            char cr= (char)('A'+r.nextInt(0,4));
            mp.put(i,cr);
        }
        int arr[]=new int[4];
        for (int i = 1; i <= 80; i++) {
            arr[(mp.get(i)-'A')]++;
        }
        int p=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[p]<arr[i+1]){
                p=i+1;
            }
        }
        System.out.println("得票最多的是"+(char)('A'+p)+",票数位："+arr[p]);
    }
}
