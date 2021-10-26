public class roundShapes {
    private double radius;
    
    public roundShapes (double a) {
        radius = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        double x = Math.PI * radius * radius;
        return x;
    }

    public double getPerimeter() {
        double x = 2 * Math.PI * radius;
        return x;
    }

    public double getSA() {
        double x = 4 * getArea();
        return x;
    }

    public double getVolume() {
        double x = getSA() / 3 * radius;
        return x;
    }
}