import java.util.*;

public class evenstevens {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter your first integer:");
    int a = scan.nextInt();
    scan.nextLine();
    System.out.println("enter your second integer:");
    int b = scan.nextInt();
    scan.nextLine();
    System.out.println("enter your third integer:");
    int c = scan.nextInt();
    scan.nextLine();
    int small = 0;
    int medium = 0;
    int large = 0;

    if (a < b && b < c) {
      small = a;
      medium = b;
      large = c;
    }
    else if (a < c && c < b) {
      small = a;
      medium = c;
      large = b;
    }
    else if (b < a && a < c) {
      small = b;
      medium = a;
      large = c;
    }
    else if (b < c && c < a) {
      small = b;
      medium = c;
      large = a;
    }
    else if (c < a && a < b) {
      small = c;
      medium = a;
      large = b;
    }
    else if (c < b && b < a) {
      small = c;
      medium = b;
      large = a;
    }
    int diff1 = large-medium;
    int diff2 = medium-small;
    if (diff1 == diff2) {
      System.out.println("hella lit");
    }
  }
}
