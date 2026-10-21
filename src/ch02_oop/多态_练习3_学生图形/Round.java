package 多态_练习3_学生图形;

public class Round extends Pic {
    public Round() {
    }

    public Round(double a, double b) {
        super(a, b);
    }

    @Override
    public double zc() {
        return 2*a*b;
    }
    @Override
    public double area() {
        return a*b*b;
    }
}
