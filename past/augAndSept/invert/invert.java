import java.util.*;

public class invert {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a number: ");
    int x = scan.nextInt();
    scan.nextLine();

    int y = x;
    int counter = 1;
    x = 0;

    while ( y > 0) {
      x *= 10;
      x += (y%10);
      y = y/10;
    }
    System.out.println(x);
  }
}
