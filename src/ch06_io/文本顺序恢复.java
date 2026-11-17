import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 文本顺序恢复 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test/sort.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("test/sortInorder.txt"));
        //读取每一行
        ArrayList<String> ar = new ArrayList<>();
        String str;
        while((str=br.readLine())!=null){
            ar.add(str);
        }
        ar.sort((a,b)->{
           return Integer.parseInt(a.split("\\.")[0])-Integer.parseInt(b.split("\\.")[0]);
        });
        for (String string : ar) {
            bw.write(string);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
