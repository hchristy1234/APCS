import java.util.*;
public class flipString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = scan.nextLine();
        System.out.println(flip(s));
    }
    public static String flip(String s) {
        String finalstr = "";
        while (s.length() > 0) {
            finalstr = finalstr + s.substring(s.length()-1);
            s = s.substring(0, s.length()-1);
        }
        return finalstr;
    }
}
