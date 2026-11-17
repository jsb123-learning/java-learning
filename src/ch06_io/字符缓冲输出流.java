import java.io.*;

public class 字符缓冲输出流 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("test/notes.txt"));
        BufferedWriter bw =  new BufferedWriter(new FileWriter("test/notes.bak"));
        String str ;
        while((str=br.readLine())!=null){
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
