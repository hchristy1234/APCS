import java.util.*;
public class throwErrors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Arithmetic Exception
        int x = 9/0;
        System.out.println(x);

        // NullPointerException
        Shoe x = null;
        System.out.prinln(x.getSize());

        // ClassCastException
        Shoe a = new Shoe();
        Heel b = (Heel) a; // bad

        // ArrayIndexOutOfBoundsException
        int[] z = new int[5];
        System.out.print(z[10]);

        // IndexOutOfBoundsException
        ArrayList<Integer> z = new ArrayList<Integer>();
        z.get(10);

        // IllegalArgumentException
        System.out.println("enter number");
        int n = scan.nextInt();
        if (n == 10) {
            throw new IllegalArgumentException("bye");
        } else {
            System.out.println("hi");
        }
    }
}
