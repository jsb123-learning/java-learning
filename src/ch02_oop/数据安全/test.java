package 数据安全;

public class test {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("旺财");
        d.setAge(2);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        d.eat(d.getAge(),d.getName());
    }
}
