import java.util.ArrayList;

public class ArrayList_练习1_集合遍历 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.print("[");
        for (int i = 0; i < al.size(); i++) {
            if(i!=al.size()-1){
                System.out.print(al.get(i)+",");
            } else{
                System.out.println(al.get(i)+"]");
            }
        }
    }
}
