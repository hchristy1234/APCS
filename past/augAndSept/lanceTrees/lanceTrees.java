import java.util.*;

public class lanceTrees {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter an integer: ");
    int num = scan.nextInt();
    scan.nextLine();
    boolean triple = false;
    int a = 10;
    int b = 10;
    int c = 10;

    while (num > 0) {
      int digit = num%10;
      num /= 10;
      c = b;
      b = a;
      a = digit;
      if (a==b && b==c) {
        triple = true;
      }
    }
    if (triple == true) {
      System.out.println("there is a triple");
    }
    else {
      System.out.println("yes, there is no triple");
    }
  }
}
