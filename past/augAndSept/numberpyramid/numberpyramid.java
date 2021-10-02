import java.util.*;

public class numberpyramid {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int num = scan.nextInt();
    scan.nextLine();

    for (int x = 1; x <= num; x++) {
      for (int i = 0; i < num-x; i++) {
        System.out.print(" ");
      }
      for (int y = 0; y < x; y++) {
        System.out.print(x);
      }
      System.out.println("");
    }
  }
}
