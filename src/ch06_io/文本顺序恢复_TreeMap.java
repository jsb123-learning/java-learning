import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class 文本顺序恢复_TreeMap {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test/sort.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("test/sortInorder.txt"));
        String str ;
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        while ((str=br.readLine())!=null){
            String arr[] = str.split("\\.");
            treeMap.put(Integer.parseInt(arr[0]),arr[1]);
        }
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
