package 继承_练习2;

public class test {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "张三");
        System.out.println(employee.getWorkid() + " " + employee.getName());
        employee.work();
        Lecturer lecturer = new Lecturer(2, "李四");
        System.out.println(lecturer.getWorkid() + " " + lecturer.getName());
        lecturer.work();
    }
}
