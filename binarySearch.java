public class binarySearch {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 13, 24, 31, 33};
        int find = 1;
        System.out.println(bsearch(a, find));
    }
    public static boolean bsearch(int[] a, int s) {
        int low = 0;
        int high = a.length-1;
        while (high >= low) {
            int check = (high+low)/2;
            if (a[check] > s) {
                high = check-1;
            }
            else if (a[check] < s) {
                low = check+1;
            }
            else if (a[check] == s) {
                return true;
            }
        }
        return false;
    }
}
