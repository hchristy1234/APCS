// Christy Huang Period 5

import java.util.*;

public class prime {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean go = true;
    // while user wants to keep going
    while (go == true) {
      // user input
      System.out.println("enter a number");
      int num = scan.nextInt();
      scan.nextLine();
      boolean prime = true;

      // goes through every number from 2 to the number and if it is divisible w/o remainder by any of them, it is not prime
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          prime = false;
        }
      }
      System.out.println(prime);

      // asks if user wants to stop
      System.out.println("do you want to enter another number?\nselect 1 for yes\nselect 2 for no");
      int cont = scan.nextInt();
      scan.nextLine();
      if (cont == 2) {
        go = false;
      }
    }
  }
}
