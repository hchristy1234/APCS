import java.util.*;
public class objectFractions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first numerator: ");
        int n1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the first denominator: ");
        int d1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the second numerator: ");
        int n2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the second denominator: ");
        int d2 = scan.nextInt();
        scan.nextLine();

        fraction x1 = new fraction(n1, d1);
        fraction x2 = new fraction(n2, d2);

        System.out.println("what operation do you want to perform? 1. addition | 2. subtraction | 3. multiplication | 4. division | 5. simplify");
        int opp = scan.nextInt();
        scan.nextLine();
        if (opp == 1) {
            sum(x1, x2);
        }
        else if (opp == 2) {
            diff(x1, x2);
        }
        else if (opp == 3) {
            prod(x1, x2);
        }
        else if (opp == 5) {
            int[] coolarr = simplify(x1);
            System.out.println("the first fraction simplified is " + coolarr[0] + "/" + coolarr[1]);
            int[] megacoolarr = simplify(x2);
            System.out.println("the second fraction simplified is " + megacoolarr[0] + "/" + megacoolarr[1]);
        }
        else {
            quot(x1, x2);
        }
    }
    public static void sum(fraction x1, fraction x2) {
        // SUM
        int sumNum = x1.getNum() * x2.getDenom() + x1.getDenom() * x2.getNum();
        int sumDenom = x1.getDenom() * x2.getDenom();
        fraction nums = new fraction(sumNum, sumDenom);
        int[] newarr = simplify(nums);
        System.out.println("the sum is " + newarr[0] + "/" + newarr[1]);
      }
    
      public static void diff(fraction x1, fraction x2) {
        // diff
        int diffNum = x1.getNum() * x2.getDenom() - x1.getDenom() * x2.getNum();
        int diffDenom = x1.getDenom() * x2.getDenom();
        fraction nums = new fraction(diffNum, diffDenom);
        int[] newarr = simplify(nums);
        System.out.println("the diff is " + newarr[0] + "/" + newarr[1]);
      }
    
      public static void prod(fraction x1, fraction x2) {
        // prod
        int prodNum = x1.getNum() * x2.getNum();
        int prodDenom = x1.getDenom() * x2.getDenom();
        fraction nums = new fraction(prodNum, prodDenom);
        int[] newarr = simplify(nums);
        System.out.println("the prod is " + newarr[0] + "/" + newarr[1]);
      }
    
      public static void quot(fraction x1, fraction x2) {
        //  QUOT
        int quotNum = x1.getNum() * x2.getDenom();
        int quotDenom = x1.getDenom() * x2.getNum();
        //int[] nums = {quotNum, quotDenom};
        fraction nums = new fraction(quotNum, quotDenom);
        int[] newarr = simplify(nums);
        System.out.println("the quot is " + newarr[0] + "/" + newarr[1]);
      }
    
      public static int[] simplify(fraction x1) {
        int num1 = x1.getNum();
        int num2 = x1.getDenom();
        int temp = num1;
        boolean done = false;
        while (done == false) {
            if (num2 % temp == 0 && num1 % temp == 0) {
                done = true;
            }
            temp -= 1;
        }
        int gcf = temp+1;
        int[] newarr = {x1.getNum()/gcf, x1.getDenom()/gcf};
        return newarr;
      }
}
