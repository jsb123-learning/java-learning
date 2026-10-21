package 方法的重写;

public class Test {
    public static void main(String[] args) {
        G3 g3 = new G3();
        g3.call(); // G3 call
        g3.message(); // G2 message
        g3.game(); // G3 game

    }
}
