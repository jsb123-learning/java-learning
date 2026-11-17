import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字符流_FileWriter_CopyNotes {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test/notes.bak");
        FileWriter fw = new FileWriter("test/tryCopy.txt");
        char chars[] = new char[3];
        while (fr.read(chars)!=-1){
            fw.write(chars);
        }
        fw.close();
        fr.close();
        FileWriter fw1 = new FileWriter("test/tryCopy.txt",true);
        fw1.write("add新加");
        fw1.close();
    }
}
