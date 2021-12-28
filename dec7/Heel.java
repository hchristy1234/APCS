public class Heel extends Shoes {
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

    public double painlevel() {
        return Math.sqrt(getSize()*getSize() - height*height);
    }

    // overwriting toString
    // just putting "size" and "color" don't work bc they're not inherited over (private attributes)
    public String toString() {
        return "I am size " + getSize() + ". I am the color " + getColor() + ". My height is " + height;
    }
}