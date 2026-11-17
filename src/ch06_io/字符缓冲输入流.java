import java.io.*;

public class 字符缓冲输入流 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test/notes.txt"));
        String str = new String();
        while((str = br.readLine())!= null){
            System.out.println(str);
        }
        br.close();
    }
}
