// Christy Huang Period 5

import java.util.*;

public class verycoolquotient {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    // getting user input
    System.out.println("enter your first number");
    int num1 = scan.nextInt();
    scan.nextLine();
    System.out.println("enter your second number");
    int num2 = scan.nextInt();
    scan.nextLine();

    // checks how many times the 2nd number goes into the first number
    int first = num1;
    int counter = 0;
    while (first >= num2) {
      first -= num2;
      counter++;
    }
    System.out.print("the answer is: " + counter + "."); // the number without remainder

    // getting the decimals. stops when counter2 reaches 10.
    int counter2 = 0;
    while (counter2 < 10) {
      first *= 10;
      int digit = 0;
      while (first >= num2) {
        digit += 1;
        first -= num2;
      }
      // printing the digit
      System.out.print(digit);
      counter2++;
    }
  }
}
