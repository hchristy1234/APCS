import java.util.*;

public class calculator {
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
        int add = int1+int2;
        System.out.println("Answer: " + add);
      }
      else if (operation == 2) {
        int subtract = int1-int2;
        System.out.println("Answer: " + subtract);
      }
      else if (operation == 3) {
        int mult = int1*int2;
        System.out.println("Answer: " + mult);
      }
      else {
        int div = int1/int2;
        System.out.println("Answer: " + div);
        int rem = int1%int2;
        System.out.println("Remainder: " + rem);
      }
      System.out.println("Do you want to run another calculation? Pick a #.\n1. Yes\n2. No");
      int cont = scan.nextInt();
      scan.nextLine();
      if (cont == 2) {
        play = false;
      }
    }
  }
}
