import java.util.*;
public class lcm2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("int #1: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("int #2: ");
        int num2 = scan.nextInt();
        scan.nextLine();
        boolean done = false;
        int temp = num1;
        while (done==false) {
            if (temp % num2 == 0) {
                done = true;
            }
            temp += num1;
        }
        System.out.println("the lcm is " + (temp-num1));
    }
}
