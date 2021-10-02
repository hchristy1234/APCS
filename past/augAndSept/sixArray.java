package past.augAndSept;
import java.util.*;
public class sixArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many integers in your array?");
        int len = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("enter an integer");
            arr[i] = scan.nextInt();
            scan.nextLine();
        }
        if (arr[0] == 6 || arr[arr.length-1] == 6) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
