import java.util.*;

public class zpyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("X");
        }
        System.out.println();
        for (int i = n-2; i >0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("X");
            for (int k = n-i-1; k > 0; k--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("X");
        }
    }
}
