import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of items in your array: ");
        int num = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter a number");
            arr[i] = scan.nextInt();
        }
        System.out.println(docoolstuff(arr));
    }
    public static boolean docoolstuff(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                counter += 2;
            }
        }
        if (counter == 8) {
            return true;
        }
        else {
            return false;
        }
    }
}
