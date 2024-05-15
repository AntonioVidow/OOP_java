package Geometry;

public class Rectangle extends Figure{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        return getA() * getB();
    }

    @Override
    public double P() {
        return 2*getA() + 2*getB();
    }
}
