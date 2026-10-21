package 对象实操作333333333333333;

import javax.swing.*;

public class Circle {
    private double r;
    private final double pai=3.14;
    public Circle(){

    }
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getC(){
        return 2*pai*r;
    }
    public double getS(){
        return pai*r*r;
    }
}
