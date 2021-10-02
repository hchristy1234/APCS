import java.util.*;

public class SDPQ {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("give me your first numerator");
    int intOne = scan.nextInt();
    scan.nextLine();

    System.out.println("give me your second numerator");
    int intTwo = scan.nextInt();
    scan.nextLine();

    System.out.println("give me your first denominator");
    int intThree = scan.nextInt();
    scan.nextLine();

    System.out.println("give me your second denominator");
    int intFour = scan.nextInt();
    scan.nextLine();

    // SUM
    int sumNum = intOne * intFour + intTwo * intThree;
    int sumDenom = intThree * intFour;
    System.out.println("the sum is " + sumNum + "/" + sumDenom);

    // diff
    int diffNum = intOne * intFour - intTwo * intThree;
    int diffDenom = intThree * intFour;
    System.out.println("the diff is " + diffNum + "/" + diffDenom);

    // prod
    int prodNum = intOne * intTwo;
    int prodDenom = intThree * intFour;
    System.out.println("the prod is " + prodNum + "/" + prodDenom);

    //  QUOT
    int quotNum = intOne * intFour;
    int quotDenom = intThree * intTwo;
    System.out.println("the quot is " + quotNum + "/" + prodDenom);
  }
}
