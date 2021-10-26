public class shoes {
    private String brand;
    private int size;
    private String color;

    public shoes(String b, int s, String c) {
        brand = b;
        size = s;
        color = c;
    }

    public String getBrand() {
        return brand;
    }
    public int getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }

    public void setBrand(String b) {
        brand = b;
    }
    public void setSize(int s) {
        size = s;
    }
    public void setColor(String c) {
        color = c;
    }
}
