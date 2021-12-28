public class Shoes {
    // attributes
    private String brand;
    private double size;
    private String color;

    // constructors

    // default constructor
    public Shoes() {
        brand = "crocs";
        size = 8;
        color = "rainbow";
    }

    // custom constructor
    public Shoes(String b, double s, String c) {
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

    public void copyCat(Shoes x) {
        color = x.getColor();
        size = x.getSize();
        brand = x.getBrand();
    }

    public double painlevel() {
        return 0;
    }

    // toString method
    public String toString() {
        return "I am size " + size + ". I am the color " + color + ".";
    }
}