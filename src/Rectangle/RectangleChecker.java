package Rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleChecker {
    public static String canFormRectangle(Point[] points){
        if(points[0].x == points[3].x && points[0].y != points[3].y && points[0].y == points[1].y && points[0].x != points[1].x){
            return "The points CAN form a rectangle";
        }

        return "The points CAN NOT form a rectangle";
    }

    public static boolean laysOnDiagonal(Point p1, Point[] points){
        double slope = (points[3].y - points[1].y) / (points[3].x - points[1].x);
        double expectedY = slope * (p1.x - points[1].x) + points[1].y;

        return Math.abs(expectedY - p1.y) < 0.000001;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] xCoordinates = new double[4];
        double[] yCoordinates = new double[4];

        Point[] points = new Point[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Input x coordinate for the " + (i + 1) +" point : ");
            xCoordinates[i] = Double.parseDouble(reader.readLine());
            System.out.println("Input y coordinate for the "+ (i + 1) + " point : ");
            yCoordinates[i] = Double.parseDouble(reader.readLine());
            points[i] = new Point(xCoordinates[i], yCoordinates[i]);
        }

        System.out.println(canFormRectangle(points));

        System.out.println("Input the coordinates of the point you want to check if it lays on the diagonal. First the x coordinate :  ");
        double x = Double.parseDouble(reader.readLine());
        System.out.println("Now input the y coordinate : ");
        double y = Double.parseDouble(reader.readLine());
        Point checkPoint = new Point(x, y);
        if (laysOnDiagonal(checkPoint, points)) System.out.println("The point you wanted ti check lays on the diagonal.");
        else System.out.println("The point you wanted to check DOES NOT lay on the diagonal.");
    }
}
