public class Heels extends shoe {
    // attribute
    private int height;
    // constructors
    public Heels() {
        super();
        height = 3;
    }

    public Heels(int s, String c, int h) {
        super(s, c);
        height = h;
    }

    // getter
    public int getHeight() {
        return height;
    }

    // setter
    public void setHeight(int h) {
        height = h;
    }

}
