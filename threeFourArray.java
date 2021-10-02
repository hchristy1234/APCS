import java.util.*;
public class threeFourArray {
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
        int[] newarray = rearrange(arr);
        for (int j = 0; j < newarray.length; j++) {
            System.out.print(newarray[j] + " ");
        }
    }
    public static int[] rearrange(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 3) {
                boolean found = false;
                int thCount = 0;
                while (found == false) {
                    if (arr[thCount] == 4 && arr[thCount-1] != 3) {
                        arr[thCount] = arr[i+1];
                        arr[i+1] = 4;
                        found = true;
                    }
                    else {
                        thCount++;
                    }
                }
            }
        }
        return arr;
    } 
}
