public class jan20 {
    public Heel() {
        super();
        height = 3;
    }
    public Heel (double s, String c, int h) {
        // this also works !!
        super(); // this gives it the default constructor values
        setSize(s); // this changes the size
        super.setSize(s); // this does the same thing as the line above but u don't need to bc of inheritance
        setcolor(c); // this changes the color
        height = h;
    }
    // cannot inherit from a grandparent; cannot use super().super()
    // but if it goes thru the parent then it's fine

    // getter
    public int getHeight() {
        return height;
    }

    // custom methods
    public void printA() {
        System.out.println("a");
    }

    public void parentPrintA() {
        super.printA(); // uses the parent's printA
    }
}
