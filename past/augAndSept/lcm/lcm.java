// Christy Huang Period 5

import java.util.*;

public class lcm {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    // getting user input and declaring variables
    System.out.println("please enter your first number: ");
    int num1 = scan.nextInt();
    scan.nextLine();
    System.out.println("please enter your second number: ");
    int num2 = scan.nextInt();
    scan.nextLine();
    int smallnum;
    int bignum;
    int number;
    boolean done = false;

    // finding the smaller num and bigger num (probably not needed)
    if (num1 < num2) {
      smallnum = num1;
      bignum = num2;
    }
    else {
      smallnum = num2;
      bignum = num1;
    }

    // keeps going until it finds a number that is a multiple of the smaller number and has 0 remainder when divided by the bigger number
    int counter = 1;
    while (done == false) {
      number = smallnum * counter;
      if (number % bignum == 0) {
        done = true;
      }
      counter++;
    }

    // prints the answer
    System.out.println((counter-1) * smallnum);
  }
}
