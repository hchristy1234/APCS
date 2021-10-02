package past.augAndSept;
import java.util.*;
public class arraySorter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many ints do you want to put in?");
        int num = scan.nextInt();
        scan.nextLine();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("enter an int: ");
            numbers[i] = scan.nextInt();
            scan.nextLine();
        }
        for (int j = 0; j < num; j++) {
            for (int i = 0; i < num-1; i++) {
                if (numbers[i] > numbers[i+1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < num; i ++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
