import java.util.*;

public class hundred {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a number");
    int number = scan.nextInt();
    scan.nextLine();

    if (number > 99) {
      int firstnum = number%1000;
      int secondnum = (firstnum - (firstnum % 100))/100;
      System.out.println(secondnum);
    }
    else {
      System.out.println("no hundredths place");
    }
  }
}
