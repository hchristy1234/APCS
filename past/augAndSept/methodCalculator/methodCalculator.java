import java.util.*;

public class methodCalculator {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Christy's Calculator");
    boolean play = true;
    while (play == true) {
      System.out.println("Which Operation do you want to perform? Pick a #.\n1. addition\n2. subtraction\n3. multiplication\n4. division w/ remainder");
      int operation = scan.nextInt();
      scan.nextLine();

      System.out.println("Please input your first integer");
      int int1 = scan.nextInt();
      scan.nextLine();

      System.out.println("Please input your second integer");
      int int2 = scan.nextInt();
      scan.nextLine();

      if (operation == 1) {
        System.out.println(add(int1, int2));
      }
      else if (operation == 2) {
        System.out.println(subtract(int1, int2));
      }
      else if (operation == 3) {
        System.out.println(multiply(int1, int2));
      }
      else {
        divide(int1, int2);
      }
      System.out.println("Do you want to run another calculation? Pick a #.\n1. Yes\n2. No");
      int cont = scan.nextInt();
      scan.nextLine();
      if (cont == 2) {
        play = false;
      }
    }
  }
  public static int add(int a, int b) {
    return a+b;
  }
  public static int subtract(int a, int b) {
    return a-b;
  }
  public static int multiply(int a, int b) {
    return a*b;
  }
  public static void divide(int a, int b) {
    int div = a/b;
    System.out.println("Answer: " + div);
    int rem = a%b;
    System.out.println("Remainder: " + rem);
  }
}
