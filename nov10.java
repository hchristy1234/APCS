public class nov10 {
    public static void main(String[] args) {
        int[] x = {30, 11, 35, 23, 0};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        // for each loops
        // works with arrays and arraylists
        // cannot modify original array
        for (int temp : x) {
            System.out.println(temp);
        }

        
    }
}
