package Homework;

public class Square extends Quadrilateral {

    public Square(Point p0, Point p1, Point p2, Point p3) {
        super(p0, p1, p2, p3);
    }

    @Override
    public double getArea() {
        double width, height;
        width = Math.abs(super.getEndPoint(1).getX() - super.getEndPoint(0).getX());
        height = Math.abs(super.getEndPoint(2).getY() - super.getEndPoint(1).getY());

        return width * height;
    }
}
