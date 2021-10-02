package past.augAndSept;
import java.util.*;
public class firstlastArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how long will your array be?");
        int len = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("enter an integer");
            arr[i] = scan.nextInt();
            scan.nextLine();
        }
        if (arr.length >=1 && arr[0] == arr[arr.length-1]) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
