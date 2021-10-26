public class rectangle {
    private double length;
    private double width;

    public rectangle (double l, double w) {
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double l) {
        length = l;
    }
    public void setWidth(double w) {
        width = w;
    }

    public double getArea() {
        double x = length * width;
        return x;
    }
    public double getPerimeter() {
        double x = length * 2 + width * 2;
        return x;
    }
    public boolean isSquare() {
        if (length == width) {
            return true;
        }
        return false;
    }
    public boolean isAreaEqualToPerimeter() {
        if (getArea() == getPerimeter()) {
            return true;
        }
        return false;
    }
}
