public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        width = 0.0;
        height = 0.0;
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public String toString() {
        // "Color: " + getColor() + ",isFilled: " + isFilled()
        return super.toStrings() + ",width: " + getWidth() + ",height: "
                + getHeight();
    }
}
