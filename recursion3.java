public class recursion3 {
    public static void main(String[] args) {
        DM(5);
        printNum(5);
        System.out.println();
        Binary(8);
    }
    public static void DM(int n) {
        if (n==1) {
            System.out.println("*");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.print(("*"));
            }
            System.out.println();
            DM(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print(("*"));
            }
            System.out.println();
        }
    }
    public static void printNum(int n) {
        if (n==1) {
            System.out.print(1);
        }
        else {
            printNum(n-1);
            System.out.print("," + n);
        }
    }
    public static void Binary(int n) {
        if (n==0) {
            System.out.print("");
        }
        else {
            Binary(n/2);
            System.out.print(n%2);
        }
    }
}
