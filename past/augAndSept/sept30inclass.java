package past.augAndSept;
public class sept30inclass {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr[i-1] = i;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] %2 == 0) {
                arr[i] = arr[i] * 5;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i%3 == 0 && i != 0) {
                arr[i] -= 6;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
