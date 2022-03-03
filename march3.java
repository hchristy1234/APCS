public class march3 {
    public static void main(String[] args) {

    }

    public static void CD(int n) {
        if (n==0) {
            System.out.println(0);
        }
        else {
            System.out.println(n);
            CD(n-1);
        }
    }

    public static int fib(int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        else {
            return (fib(n-1) + fib(n-2));
        }
    }

    BTS (Tree) {
        print value
        if (left != NULL) {
            go left
        }
        if (right != NULL) {
            go right
        }
    }
    
}
