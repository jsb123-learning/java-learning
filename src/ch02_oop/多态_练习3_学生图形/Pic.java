package 多态_练习3_学生图形;

public class Pic {
    double a;
    double   b;

    public Pic() {
    }

    public Pic(double  a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double zc(){
        return 2*(a+b);
    }
    public double area(){
        return a*b;
    }
}
