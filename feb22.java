public class feb22 {
    public static void main(String[] args) {
        countDown(10);
    }
    // easy.
    public static void countDown(int n) {
        while (n>=0) {
            System.out.println(n-1);
            n--;
        }
    }
    // one-directional recursion
    public static void rCountDown(int n) {
        if (n==0) { // loop end
            System.out.println(0);
        }
        else { // loop condition
            System.out.println(n); // action
            countDown(n-1); // interation
        }
    }
}
