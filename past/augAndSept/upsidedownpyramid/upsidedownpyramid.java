import java.util.*;

public class upsidedownpyramid {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int num = scan.nextInt();
    scan.nextLine();

    for (int x = num; x > 0; x--) {
      for (int y = 0; y < x; y++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
