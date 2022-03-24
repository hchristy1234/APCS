public class march24 {
    public static void main(String[] args) {

    }
    public static void f(int n) {
        if (n <= 0) {
            System.out.print(0 + " ");
        }
        else {
            System.out.print(n + " ");
            f(n-2);
            if (n%2 == 0) {
                n--;
            }
            else {
                n++;
            }
            System.out.print(n + " ");
        }
    }
}
