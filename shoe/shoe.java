public class shoe {
    // attributes
    private String brand;
    private double size;
    private String color;

    // constructors

    // default constructor
    public shoe() {
        brand = "crocs";
        size = 8;
        color = "rainbow";
    }

    // custom constructor
    public shoe(String b, double s, String c) {
        brand = b;
        size = s;
        color = c;
    }

    // getters
    public String getBrand() {
        return brand;
    }
    public double getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }

    // setters
    public void setBrand(String b) {
        brand = b;
    }
    public void setSize(double s) {
        size = s;
    }
    public void setColor(String c) {
        color = c;
    }
}
