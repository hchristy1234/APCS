import java.util.*;

public class asteriskPyramid {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int num = scan.nextInt();
    scan.nextLine();

    for (int x = 1; x <= num; x++) {
      for (int y = 0; y < x; y++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
