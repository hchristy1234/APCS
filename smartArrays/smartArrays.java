import java.util.*;
public class smartArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many values in your array?");
        int num = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Please enter a value: ");
            arr[i] = scan.nextInt();
            scan.nextLine();
        }
        System.out.println("What do you want to do? 1. Add to end | 2. Add to specific spot | 3. Remove from end | 4. Remove from specific spot | 5. Replace | 6. Index Of");
        int choice = scan.nextInt();
        scan.nextLine();
        if (choice == 1) {
            System.out.println("What value do you want to add to the end?");
            int n = scan.nextInt();
            scan.nextLine();
            int[] updated = Add(arr, n);
            for (int i = 0; i < updated.length; i++) {
                System.out.print(updated[i] + " ");
            }
        }
        else if (choice == 2) {
            System.out.println("What index spot do you want to add a value to?");
            int spot = scan.nextInt();
            scan.nextLine();
            System.out.println("What value do you want to add to that spot?");
            int value = scan.nextInt();
            scan.nextLine();
            int[] updated = Add(arr, spot, value);
            for (int i = 0; i < updated.length; i++) {
                System.out.print(updated[i] + " ");
            }
        }
        else if (choice == 3) {
            int[] updated = Remove(arr);
            for (int i = 0; i < updated.length; i++) {
                System.out.print(updated[i] + " ");
            }
        }
        else if (choice == 4) {
            System.out.println("Which spot would you like to remove the value of?");
            int spot = scan.nextInt();
            scan.nextLine();
            int[] updated = Remove(arr, spot);
            for (int i = 0; i < updated.length; i++) {
                System.out.print(updated[i] + " ");
            }
        }
        else if (choice == 5) {
            System.out.println("Which spot would you like to replace the value of?");
            int spot = scan.nextInt();
            scan.nextLine();
            System.out.println("What value would you like to put in that spot?");
            int value = scan.nextInt();
            scan.nextLine();
            int[] updated = Replace(arr, spot, value);
            for (int i = 0; i < updated.length; i++) {
                System.out.print(updated[i] + " ");
            }
        }
        else if (choice == 6) {
            System.out.println("Which value would you like to look for?");
            int value = scan.nextInt();
            scan.nextLine();
            int index = indexOf(arr, value);
            System.out.println(index);
        }
    }
    public static int[] Add(int[] arr, int value) {
        int[] newarr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = value;
        return newarr;
    }
    public static int[] Add(int[] arr, int spot, int value) {
        int[] newarr = new int[arr.length+1];
        for (int i = 0; i < spot; i++) {
            newarr[i] = arr[i];
        }
        newarr[spot] = value;
        for (int i = spot+1; i<arr.length+1; i++) {
            newarr[i] = arr[i-1];
        }
        return newarr;
    }
    public static int[] Remove(int[] arr) {
        int[] newarr = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }
    public static int[] Remove(int[] arr, int spot) {
        int[] newarr = new int[arr.length-1];
        for (int i = 0; i < spot; i++) {
            newarr[i] = arr[i];
        }
        for (int i = spot; i < arr.length-1; i++) {
            newarr[i] = arr[i+1];
        }
        return newarr;
    }
    public static int[] Replace(int[] arr, int spot, int value) {
        arr[spot] = value;
        return arr;
    }
    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
