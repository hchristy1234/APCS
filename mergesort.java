public class mergesort {
    public static void main(String[] args) {

    }
    public static int merge(int[] a) {
        // make 2d array
    }
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        int aCounter = 0;
        int bCounter = 0;
        int newArrAt = 0;
        while (newArr.length < a.length + b.length) {
            if (a[aCounter] < b[bCounter]) {
                newArr[newArrAt] = a[aCounter];
                newArrAt++;
                aCounter++;
            }
            else {
                newArr[newArrAt] = b[bCounter];
                newArrAt++;
                bCounter++;
            }
        }
        return newArr;
    }
}
