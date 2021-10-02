
import java.util.*;
public class gcf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an int: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("enter another int: ");
        int num2 = scan.nextInt();
        scan.nextLine();
        int temp = num1;
        boolean done = false;
        while (done == false) {
            if (num2 % temp == 0 && num1 % temp == 0) {
                done = true;
            }
            temp -= 1;
        }
        System.out.println("answer is " + (temp + 1));
    }
}
