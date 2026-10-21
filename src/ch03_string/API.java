import java.util.Random;

public class API {
    public static void main(String[] args) {
        Random r = new Random();
        double a = r.nextDouble();
        System.out.println(a);
        double b =r.nextDouble(1.9);
    }
}
