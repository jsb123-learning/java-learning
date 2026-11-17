package 综合练习_TreeSet_比较器排序;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // 1. 实例化对象，增加变量名可读性 ✨
        Student studentA = new Student("001", 1);
        Student studentB = new Student("002", 2);
        Student studentC = new Student("003", 3);
        Student studentD = new Student("001", 3);

        // 2. Tree Set + Lambda 简化版 (◕‿◕)
        TreeSet<Student> ts = new TreeSet<>((s1, s2) -> {
            if (s1.getName() == null || s2.getName() == null) return 0;
            
            // 优先比较 ID/姓名， compareTo 原生支持字典序（ASCII）
            int nameCompare = s1.getName().compareTo(s2.getName());
            
            // 如果 ID 相同，再按年龄排序 🎂
            if (nameCompare == 0) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
            return nameCompare;
        });

        ts.add(studentA);
        ts.add(studentB);
        ts.add(studentC);
        ts.add(studentD);

        // 3. 美化输出格式 ⭐
        System.out.println("=== 排序结果 (ID -> 姓名/年龄) ===");
        for (Student stu : ts) {
            System.out.printf("%s: ID=%s, Age=%d%n", 
                    stu.getClass().getSimpleName(), stu.getName(), stu.getAge());
        }
    }
}
