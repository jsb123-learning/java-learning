import java.util.ArrayList;

public class Collection_增强for_遍历集合 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i+=2) {
            al.add(i);
        }
        for(Integer i :al){
            System.out.println(i);
            }
        System.out.println(al);
        }
    }

