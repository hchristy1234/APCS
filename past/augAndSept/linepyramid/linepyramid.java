import java.util.*;

public class linepyramid {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int num = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
