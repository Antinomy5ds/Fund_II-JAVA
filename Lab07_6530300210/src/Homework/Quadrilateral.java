package Homework;

public class Quadrilateral {
    Point[] endPoints = new Point[4];

    public Quadrilateral(Point p0, Point p1, Point p2, Point p3) {
        this.endPoints[0] = p0;
        this.endPoints[1] = p1;
        this.endPoints[2] = p2;
        this.endPoints[3] = p3;
    }

    public double getArea() {
        return 0.0;
    }

    public Point getEndPoint(int index) {
        return this.endPoints[index];
    }
}
