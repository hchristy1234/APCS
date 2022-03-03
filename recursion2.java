public class recursion2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(4));
        int[] x = {1, 11, 2, 11, 11};
        System.out.println(array11(x, 0));
    }

    public static int bunnyEars(int n) {
        if (n==0) {
            return 0;
        }
        else {
            return 2 + bunnyEars(n-1);
        }
    }

    public static int array11(int[] a, int b) {
        if (b == a.length) {
            return 0;
        }
        else {
            if (a[b] == 11) {
                return 1 + array11(a, b+1);
            }
            else {
                return array11(a, b+1);
            }
        }
    }
}
