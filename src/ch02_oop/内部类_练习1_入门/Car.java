package 内部类_练习1_入门;

public class Car {
    public Car() {
    }

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    String carName;
    int carAge;
    String carColor;
    class Engine {

        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        String engineName;
        int engineAge;
    }

}
