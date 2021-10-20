public class shoe {
    private String brand;
    private double size;
    private String color;
    private sock sockies;

    public shoe() {
        brand = "Nike";
        size = 10;
        color = "white";
        sockies = new sock();
    }
    public shoe(String b, double s, String c, sock soc) {
        brand = b;
        size = s;
        color = c;
        sockies = soc;
    }
    public String getBrand() {
        return brand;
    }
    public double getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public sock getSockies() {
        return sockies;
    }

    public void setBrand(String b) {
        brand = b;
    }
    public void setSize(double s) {
        size = s;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setSockies(sock s) {
        sockies = s;
    }

}
