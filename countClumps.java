public class countClumps {
    public static void main (String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(arr));
    }
    public static int countClumps(int[] arr) {
        int clumpcounter = 0;
        int currentint = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1] && clumpcounter == 0) {
                clumpcounter++;
                currentint = arr[i];
            }
            else if (arr[i] == arr[i+1] && currentint != arr[i]) {
                clumpcounter++;
                currentint = arr[i];
            }
            else {
                currentint = arr[i];
            }
        }
        return clumpcounter;
    }
}
