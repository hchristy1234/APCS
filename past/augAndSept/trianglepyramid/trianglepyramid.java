import java.util.*;

public class trianglepyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i<=n; i++) {
            for (int j = (2*n-1-(2*i-1))/2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int q = 0; q < 2*i-1; q++) {
                System.out.print("X");
            }
            for (int j = (2*n-1-i)/2; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
