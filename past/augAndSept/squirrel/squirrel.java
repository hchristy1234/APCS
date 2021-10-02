import java.util.*;

public class squirrel {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("temperature:");
    int temp = scan.nextInt();
    scan.nextLine();
    System.out.println("is summer? true or false");
    boolean isSummer = scan.nextBoolean();
    scan.nextLine();

    if (isSummer) {
      if (temp >= 60 && temp <= 100) {
        System.out.println("true");
      }
      else {
        System.out.println("false");
      }
    }
    else {
      if (temp >= 60 && temp <= 90) {
        System.out.println("true");
      }
      else {
        System.out.println("false");
      }
    }
  }
}
