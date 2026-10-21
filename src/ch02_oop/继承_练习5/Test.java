package 继承_练习5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Normal normal = new Normal("1", 10, "张三");
        System.out.println(normal.money());
        fast fast = new fast("2", 20, "李四");
        System.out.println(fast.money());
        slow slow = new slow("3", 30, "王五");
        System.out.println(slow.money());
    }
}
