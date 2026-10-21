package 匿名内部类_练习;

public class Test {
    public static void main(String[] args) {
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("swimming");
            }
        };
        goSwimming(s);


    }

    public static void goSwimming(Swim s) {
        s.swim();
    }
}

