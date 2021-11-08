import java.util.*;
public class fifteenSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("enter an int: ");
            numbers[i] = scan.nextInt();
            scan.nextLine();
        }
        boolean unsorted = true;
        while (unsorted == true) {
            int counter = 0;
            System.out.println("in the loop");
            for (int i = 0; i < 14; i++) {
                if (numbers[i] > numbers[i+1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    counter++;
                }
            }
            if (counter == 0) {
                unsorted = false;
            }
        }
        for (int i = 0; i < 15; i ++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
// n-1 iterations maximum