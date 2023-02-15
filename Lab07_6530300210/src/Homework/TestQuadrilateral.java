package Homework;

public class TestQuadrilateral {
    public static void main(String[] args) {
        // พื้นที่สี่เหลี่ยมคางหมู
        Point p0 = new Point(0, 0);
        Point p1 = new Point(2, 0);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(3, 3);

        Trapezoid areaTrapezoid = new Trapezoid(p0, p1, p2, p3);
        System.out.printf("The area of Trapezoid is %.2f \n", areaTrapezoid.getArea());
        // พื้นที่สี่เหลี่ยมด้านขนาน
        Point p4 = new Point(0, 0);
        Point p5 = new Point(3, 0);
        Point p6 = new Point(2, 2);
        Point p7 = new Point(5, 2);

        Parallelogram areaParallelogram = new Parallelogram(p4, p5, p6, p7);
        System.out.printf("The area of Parallelogram is %.2f \n", areaParallelogram.getArea());
        // พื้นที่สี่เหลี่ยมผืนผ้า
        Point p8 = new Point(0, 0);
        Point p9 = new Point(5, 0);
        Point p10 = new Point(5, 3);
        Point p11 = new Point(0, 3);

        Rectangle areaRectangle = new Rectangle(p8, p9, p10, p11);
        System.out.printf("The area of rectangle is %.2f \n", areaRectangle.getArea());
        // พื้นที่สี่เหลี่ยมจัตุรัส
        Point p12 = new Point(0, 0);
        Point p13 = new Point(3, 0);
        Point p14 = new Point(3, 3);
        Point p15 = new Point(0, 3);
        Square areaSquare = new Square(p12, p13, p14, p15);
        System.out.printf("The area of square is %.2f \n", areaSquare.getArea());
    }

}
