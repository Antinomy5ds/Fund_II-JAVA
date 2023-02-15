package Homework;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(Point p0, Point p1, Point p2, Point p3) {
        super(p0, p1, p2, p3);

    }

    @Override
    public double getArea() {
        double base, height;
        // หาพื้นที่ฐาน โดยการหาผลรวมของความกว้างและยาว
        base = Math.sqrt(Math.pow(super.getEndPoint(1).getX() - super.getEndPoint(0).getX(), 2)
                + Math.pow(super.getEndPoint(1).getY() - super.getEndPoint(0).getY(), 2));
        height = Math.abs(super.getEndPoint(2).getY() - super.getEndPoint(1).getY());

        return base * height;
    }
}
