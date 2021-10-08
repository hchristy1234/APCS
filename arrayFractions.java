import java.util.*;

public class arrayFractions {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] frac1 = new int[2];
    int[] frac2 = new int[2];
    System.out.println("give me your first numerator");
    frac1[0] = scan.nextInt();
    scan.nextLine();

    System.out.println("give me your first denominator");
    frac1[1] = scan.nextInt();
    scan.nextLine();

    System.out.println("give me your second numerator");
    frac2[0] = scan.nextInt();
    scan.nextLine();

    System.out.println("give me your second denominator");
    frac2[1] = scan.nextInt();
    scan.nextLine();

    System.out.println("what operation do you want to perform? 1. addition | 2. subtraction | 3. multiplication | 4. division | 5. simplify");
    int opp = scan.nextInt();
    scan.nextLine();
    if (opp == 1) {
        sum(frac1, frac2);
    }
    else if (opp == 2) {
        diff(frac1, frac2);
    }
    else if (opp == 3) {
        prod(frac1, frac2);
    }
    else if (opp == 5) {
        int[] coolarr = simplify(frac1);
        System.out.println("the first fraction simplified is " + coolarr[0] + "/" + coolarr[1]);
        int[] megacoolarr = simplify(frac2);
        System.out.println("the second fraction simplified is " + megacoolarr[0] + "/" + megacoolarr[1]);
    }
    else {
        quot(frac1, frac2);
    }
  }
  public static void sum(int[] int1, int[] int2) {
    // SUM
    int sumNum = int1[0] * int2[1] + int1[1] * int2[0];
    int sumDenom = int1[1] * int2[1];
    int[] nums = {sumNum, sumDenom};
    int[] newarr = simplify(nums);
    System.out.println("the sum is " + newarr[0] + "/" + newarr[1]);
  }

  public static void diff(int[] int1, int[] int2) {
    // diff
    int diffNum = int1[0] * int2[1] - int1[1] * int2[0];
    int diffDenom = int1[1] * int2[1];
    int[] nums = {diffNum, diffDenom};
    int[] newarr = simplify(nums);
    System.out.println("the diff is " + newarr[0] + "/" + newarr[1]);
  }

  public static void prod(int[] int1, int[] int2) {
    // prod
    int prodNum = int1[0] * int2[0];
    int prodDenom = int1[1] * int2[1];
    int[] nums = {prodNum, prodDenom};
    int[] newarr = simplify(nums);
    System.out.println("the prod is " + newarr[0] + "/" + newarr[1]);
  }

  public static void quot(int[] int1, int[] int2) {
    //  QUOT
    int quotNum = int1[0] * int2[1];
    int quotDenom = int1[1] * int2[0];
    int[] nums = {quotNum, quotDenom};
    int[] newarr = simplify(nums);
    System.out.println("the quot is " + newarr[0] + "/" + newarr[1]);
  }

  public static int[] simplify(int[] nums) {
    int num1 = nums[0];
    int num2 = nums[1];
    int temp = num1;
    boolean done = false;
    while (done == false) {
        if (num2 % temp == 0 && num1 % temp == 0) {
            done = true;
        }
        temp -= 1;
    }
    int gcf = temp+1;
    int[] newarr = {nums[0]/gcf, nums[1]/gcf};
    return newarr;
  }
}
