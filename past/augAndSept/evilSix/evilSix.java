import java.util.*;

public class evilSix {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter an int: ");
    int num = scan.nextInt();
    scan.nextLine();
    int finalnum = 0;
    int mult = 1;

    while(num > 0) {
      int x = num%10;
      if (x != 6) {
        finalnum += (mult * x);
        mult *= 10;
      }
      num /= 10;
    }
    System.out.println(finalnum);
  }
}
