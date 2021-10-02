package past.augAndSept;
import java.util.*;
public class backwardsPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an int: ");
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < 2*num-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num-2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
