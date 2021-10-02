import java.util.*;

public class mxbEq {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Give me your first x point?");
    double x1 = scan.nextDouble();
    scan.nextLine();

    System.out.println("Give me your first y point?");
    double y1 = scan.nextDouble();
    scan.nextLine();

    System.out.println("Give me your second x point?");
    double x2 = scan.nextDouble();
    scan.nextLine();

    System.out.println("Give me your second y point?");
    double y2 = scan.nextDouble();
    scan.nextLine();

    double slope = (y2-y1)/(x2-x1);
    double b = y1 - x1 * slope;

    System.out.println("y = " + slope + "x" + "+" + b);
  }
}
