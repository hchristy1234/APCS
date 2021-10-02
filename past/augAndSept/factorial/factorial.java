import java.util.*;

public class factorial {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int num = scan.nextInt();
    scan.nextLine();
    int total = 1;
    for (int i = 1; i <= num; i++) {
      total = total * i;
    }
    System.out.println("The answer is " + total);
  }
}
