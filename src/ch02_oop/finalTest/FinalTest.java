package finalTest;

public class FinalTest {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        //无法改变的是s中记录的对象的内存地址
       //final Student s= new Student();
        //////
         //锁定S对象的内存地址数值；
       final Student S = new Student();
       //创建一个新的对象内存地址，赋值给S，因为S值不可变动所以报错；
        //S=new Student();
        //因为final了长量，所以方法值进步去
        //S.setAge(18);
        //S.setName("里斯");
        S.getAge();
        S.getName();
    }
}
