import java.io.*;

public class 拷贝计时 {
    public static void main(String[] args) throws IOException {
        FileInputStream src = new FileInputStream("test/notes.txt");
        FileOutputStream fosOneByte = new FileOutputStream("test/notes.Onebyte");
        //一字节
        int  Oneb = 0;
        long OnebTimesstart= System.currentTimeMillis();
         while((Oneb=src.read())!=-1){
             fosOneByte.write(Oneb);
         }
         long OnebTimes =System.currentTimeMillis()-OnebTimesstart;
         fosOneByte.close();
         src.close();
         //字节数组
        FileInputStream srcArr = new FileInputStream("test/notes.txt");
        FileOutputStream fosArrByte = new FileOutputStream("test/ontes.Arrbyte");
        byte Arrbytes[] = new byte[8];
        int len;
        long Arrbtimesstart = System.currentTimeMillis();
        while((len=srcArr.read(Arrbytes))!=-1){
            fosArrByte.write(Arrbytes,0,len);
        }
        long ArrbTimes = System.currentTimeMillis()-Arrbtimesstart;
        fosArrByte.close();
        srcArr.close();
        //缓冲字节；
        BufferedInputStream bufferSrc = new BufferedInputStream(new FileInputStream("test/notes.txt"));
        BufferedOutputStream bosOnebyte = new BufferedOutputStream(new FileOutputStream("test/notes.bosOne"));
        int BufferOne;
        long BufferOneTimesStart = System.currentTimeMillis();
        while ((BufferOne=bufferSrc.read())!=-1){
            bosOnebyte.write(BufferOne);
        }
        long BufferOneTimes = System.currentTimeMillis()-BufferOneTimesStart;
        bosOnebyte.close();
        bufferSrc.close();
        //缓冲字节数组；
        BufferedInputStream buffArrsrc = new BufferedInputStream(new FileInputStream("test/notes.txt"));
        BufferedOutputStream bosArrbyte = new BufferedOutputStream(new FileOutputStream("test/notes.bosArr"));
        byte bosBytes[] = new byte[8];
        int Boslen;
        long BufferArrtimesstart = System.currentTimeMillis();
        while ((Boslen=buffArrsrc.read(bosBytes))!=-1){
            bosArrbyte.write(bosBytes,0,Boslen);
        }
        long BufferArrtimes = System.currentTimeMillis()-BufferArrtimesstart;
        buffArrsrc.close();
        bosArrbyte.close();
        src.close();
        System.out.println("基本流一字节："+OnebTimes);
        System.out.println("基本流数组："+ArrbTimes);
        System.out.println("缓冲流一字节："+BufferOneTimes);
        System.out.println("缓冲流数组："+BufferArrtimes);
    }
}
