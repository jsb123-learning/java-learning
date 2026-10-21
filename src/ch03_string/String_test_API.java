public class String_test_API {
    public static void main(String[] args) {
        String name = "Alex";
        System.out.println(name);
        String s = new String();
        System.out.println(s);
        String s1 = new String(name);
        System.out.println(s1);
        String s2 = new String("Bob");
        System.out.println(s2);
        char a []= {'A','B','C'};
        String sz = new String(a);
        System.out.println(a);
    }
}
