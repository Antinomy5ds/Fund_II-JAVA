package Homework;

public class Rectangle extends Quadrilateral {

    public Rectangle(Point p0, Point p1, Point p2, Point p3) {
        super(p0, p1, p2, p3);
    }

    @Override
    public double getArea() {
        double width, height;
        // หาความกว้างโดยการนำตำแหน่ง ที่ 2 มาลบกับตำแหน่งที่ 1
        width = Math.abs(super.getEndPoint(1).getX() - super.getEndPoint(0).getX());
        // หาความยาวโดยการนำตำแหน่ง ที่ 2 มาลบกับตำแหน่งที่ 1
        height = Math.abs(super.getEndPoint(2).getY() - super.getEndPoint(1).getY());

        return width * height;
    }
}
