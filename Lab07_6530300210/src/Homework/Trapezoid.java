package Homework;

public class Trapezoid extends Quadrilateral {

    public Trapezoid(Point p0, Point p1, Point p2, Point p3) {
        super(p0, p1, p2, p3);
    }

    @Override
    public double getArea() {
        double area1, area2, height;
        // หาขนาดของด้านทั้ง 2 ด้านของคางหมู
        area1 = Math.sqrt(Math.pow(super.getEndPoint(1).getX() - super.getEndPoint(0).getX(), 2)
                + Math.sqrt(Math.pow(super.getEndPoint(1).getY() - super.getEndPoint(0).getY(), 2)));
        area2 = Math.sqrt(Math.pow(super.getEndPoint(3).getX() - super.getEndPoint(2).getX(), 2)
                + Math.sqrt(Math.pow(super.getEndPoint(3).getY() - super.getEndPoint(1).getY(), 2)));
        // หาคามสูง
        height = Math.abs(super.getEndPoint(2).getY() - super.getEndPoint(1).getY());

        return ((area1 + area2) * height) * 0.5;
    }

}
