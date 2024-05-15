package Geometry;

public class Triangle extends Figure{
    private double c;
    private double h;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Triangle(double a, double b, double c, double h) {
        super(a, b);
        this.c = c;
        this.h = h;
    }

    @Override
    public double area() {
        return (c*h)/2;
    }

    @Override
    public double P() {
        return getA() + getB() + c;
    }
}
