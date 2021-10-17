import java.util.*;
public class iselim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        System.out.println(deletion(s));
    }
    public static String deletion(String s) {
        String finalstr = "";
        for(int i = 0; i<s.length()-1; i++) {
            String a = s.substring(i, i+1);
            String b = s.substring(i+1, i+2);
            if (a.compareTo(b) != 0) {
                finalstr = finalstr+a;
            }
            if (i==s.length()-2) {
                finalstr = finalstr+b;
            }
        }
        return finalstr;
    }
}
