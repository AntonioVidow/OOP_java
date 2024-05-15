package Geometry;

public class Test {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3.0,4.0,5.0, 2.4);
        System.out.println(t1.area());
        System.out.println(t1.P());

        Rectangle r1 = new Rectangle(4.0, 8.0);
        System.out.println(r1.area());
        System.out.println(r1.P());
    }
}
