public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.00);
        double radius, area;
        radius = c1.getRadius();
        area = c1.getArea();

        System.out.printf("The circle has Radius of %.2f\n", radius);
        System.out.printf("The circle has Area of %.2f\n\n", area);

        Circle c2 = new Circle(2.00);
        radius = c2.getRadius();
        area = c2.getArea();

        System.out.printf("The circle has Radius of %.2f\n", radius);
        System.out.printf("The circle has Area of %.2f\n", area);
    }
}
