import java.util.*;
public class stringSegment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String x = scan.nextLine();
        System.out.println("Enter the first int: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the second int: ");
        int b = scan.nextInt();
        scan.nextLine();

        System.out.println(getSubstring(x, a, b));
    }
    public static String getSubstring(String x, int a, int b) {
        String finalstr = "";
        if (a >= 0 && b >= 0) {
            finalstr = x.substring(a-1, b);
        }
        else {
            int newa = a - a - a;
            int newb = b - b - b;
            for (int j = x.length()-newa; j >= x.length()-newb; j--) {
                finalstr = finalstr + x.charAt(j);
            }
            // finalstr = x.substring(x.length()-newb, x.length()-newa);
        }
        return finalstr;
    }
}
