package 多态_概念1_成员调用;

import 多态_练习1_初步了解.Student;

public class Test {
    public static void main(String[] args) {
        //变量调用：编译看左边，运行也看左边
        //编译看左边：在把java编译成字节码（class）时，会检查变量的类型
        //存不存在，若不存在，则会报错。
        //运行也看左边：实际使用的值，也是左边的值
        //
        Fu f = new Zi();
        System.out.println(f.name);
        //方法调用：编译看左边，运行看右边
        //编译看左边：在把java编译成字节码（class）时，会检查方法的类型
        //存不存在，若不存在，则会报错。
        //运行看右边：实际调用的方法，是右边的实现
        f.fuShow();
        f.show();
        //
        Zi z= (Zi) f;
        z.ziShow();
        z.show();
        System.out.println(z.name);
        //
        Ye y = new Fu();
        System.out.println(y.name);
        y.show();
        //
        Zi z1 =(Zi) y;
    }
}
