import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class 综合练习_TreeMap_字符串排序 {
    public static void main(String[] args) {
        String str="abbabcabcdabcde";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char arr[]=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        Set<Map.Entry<Character,Integer>> entries = hashMap.entrySet();
        TreeMap<Character,Integer> tm = new TreeMap<>((c1,c2)->{
            return hashMap.get(c2)-hashMap.get(c1);
        });
        for (Map.Entry<Character, Integer> entry : entries) {
            tm.put(entry.getKey(),entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        tm.forEach((key,value)->{
            sb.append(key).append("(").append(value).append(")");
        });
        System.out.println(sb);

    }
}
