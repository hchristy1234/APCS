
import java.util.*;
public class sum {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an int: ");
        int num = scan.nextInt();
        scan.nextLine();
        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num/=10;
        }
        System.out.println("the sum is " + sum);
   } 
}
