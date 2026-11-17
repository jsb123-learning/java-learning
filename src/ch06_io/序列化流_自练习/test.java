package 序列化流_自练习;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        student student = new student("zhangsan",12);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test/object.txt"));
        oos.writeObject(student);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test/object.txt"));
        int len;
        System.out.println(ois.readObject().toString());
    }

}
