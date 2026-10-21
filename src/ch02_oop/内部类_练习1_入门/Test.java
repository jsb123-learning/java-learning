package 内部类_练习1_入门;

public class Test {
    public static void main(String[] args) {
        Car c = new Car("benci", 10, "red");
        Car.Engine e = c.new Engine("engine", 5);
        System.out.println(c.carName);
        System.out.println(e.engineName);

    }
}
