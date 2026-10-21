package 枚举.电商订单状态;

import java.sql.SQLOutput;

public class EnumTest {
    public static void main(String[] args) {
        //每一个枚举项，都是该枚举类的对象，每一个对象都是通过构造方法创建的
        Status s = Status.LOADING_PAY;
        System.out.println(s.getName());
        Status a[] = Status.values();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        Status b = Status.valueOf("LOADING_PAY");
        System.out.println(s.getName());
    }

}
