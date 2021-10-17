import java.util.*;
public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = scan.nextInt();
        scan.nextLine();
        int[] oldarr = new int[num];
        int[] arr = new int[num];
        for (int i = 1; i <= num; i++) {
            if (i==1) {
                arr[0] = 1;
            }
            else if (i==2) {
                arr[0] = 1;
                arr[1] = 1;
            }
            else {
                arr[0] = 1;
                arr[i-1] = 1;
                for(int j = 0; j < i-2; j++) {
                    arr[j+1] = oldarr[j] + oldarr[j+1];
                }
            }
            for(int y = 0; y < i; y++) {
                System.out.print(arr[y] + " ");
            }
            for (int c = 0; c < arr.length; c++) {
                oldarr[c] = arr[c];
            }
            System.out.println();
        }

    }
}
