import java.util.*;
public class arrayLocate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values in your array?");
        int n = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("Enter number");
            arr[j] = scan.nextInt();
            scan.nextLine();
        }
        System.out.println("What index do you want?");
        int index = scan.nextInt();
        scan.nextLine();

        System.out.println(getIndex(arr, index));
    }
    public static int getIndex(int[] arr, int index) {
        int finaln = 0;
        if(index >= 0 ) {
            finaln = arr[index];
        }
        else {
            int temp = index - index - index;
            int realindex = arr.length - temp;
            finaln = arr[realindex]; 
        }
        return finaln;
    }
}
