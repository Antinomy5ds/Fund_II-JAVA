package Lab61;

class Circle extends GeometricObject {
    private double radius = 0.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return super.toStrings() + ",radius: " + radius;
    }

    public double getDiameter() {
        return 2 * Math.PI * radius;
    }

}
