package Lab61;

abstract class GeometricObject {
    private String color = "white";
    private boolean filled = false;

    public GeometricObject() {

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toStrings() {
        return "Color: " + color + ",isFilled: " + filled;
    }

    public double getArea() {
        return 0;
    }

}
