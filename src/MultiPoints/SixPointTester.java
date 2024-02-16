package MultiPoints;

import java.util.Scanner;

public class SixPointTester {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        enterPoints();
        computeShortestDistance(enterPoints());
    }

    public static Point[] enterPoints() {
        Point[] points = new Point[6];
        System.out.println("Enter 6 points of x and y coordinates: ");
        for (int i = 0; i <= points.length; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            points[i] = new Point(x, y);
            //points[i] = new Point(input.nextDouble(), input.nextDouble());
        }
        return points;
    }
//
    public static void computeShortestDistance(Point[] points){
        double shortestDistance = Double.MAX_VALUE;
        Point p1 = null; //initialize with default value. make the point null
        Point p2 = null;
        //int[] abc = new int[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j <= points.length; j++){
                double dist = Point.distance(points[i], points[j]);
                if (dist < shortestDistance) {
                    shortestDistance = dist;
                    p1 = points[i];//complete
                    p2 = points[j];
                }
            }
        }
        System.out.printf("The shortest distance of two points (%.1f, %.1f) and (%.1f, %.1f) is (%.2f)",p1.getX(),p1.getY(),p2.getX(),p2.getY(), shortestDistance);
    }





}
