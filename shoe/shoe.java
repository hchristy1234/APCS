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

    // custom custom constructor
    // finesse the constructor
    public Shoes(String c) {
        size = 7;
        for (int i = 0; i < 4; i++) {
            size+= getSize();
        }
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

    public void stuff() {
        System.out.println("i am shoe");
    }

    // toString method
    public String toString() {
        return "I am size " + size + ". I am the color " + color + ".";
    }
}