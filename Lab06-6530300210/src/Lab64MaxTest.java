public class Lab64MaxTest {
    public static void main(String[] args) {
        ComparableRectangle rectangle1 = new ComparableRectangle(4, 5);
        ComparableRectangle rectangle2 = new ComparableRectangle(3, 6);
        Rectangle r = (Rectangle) Max.max(rectangle1, rectangle2);
        System.out.println(r.getArea());
        CompareableCircle circle1 = new CompareableCircle(3);
        CompareableCircle circle2 = new CompareableCircle(0);
        Circle c = (Circle) Max.max(circle1, circle2);
        System.out.println(c.getArea());

    }

}
