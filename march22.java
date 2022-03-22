public class march22 {
    public static void main(String[] args) {
        printStars(4, 5);
    }
    public static void printStars(int a, int b) {
        if (a == 0) {}
        else {
            starHelper(b);
            System.out.println();
            printStars(a-1, b);
        }
    }
    public static void starHelper(int a) {
        if (a==0) {}
        else {
            System.out.print("*");
            starHelper(a-1);
        }
    }
}
