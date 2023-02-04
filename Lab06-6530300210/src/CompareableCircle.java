public class CompareableCircle extends Circle implements Comparable {
    public CompareableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object z) {
        if (getArea() > ((CompareableCircle) z).getArea()) {
            return 1;
        } else if (getArea() < ((CompareableCircle) z).getArea()) {
            return -1;
        } else
            return 0;
    }
}
