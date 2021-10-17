import java.util.*;
public class eliminatedoubleletters {
    public static void main(String[] args) {
        Scanner RAWR = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String MEOW = RAWR.nextLine();
        for (int WOOF = 0; WOOF < MEOW.length()*100; WOOF++) {
            MEOW = deletion(MEOW);
        }
        System.out.println(MEOW);
    }
    public static String deletion(String s) {
        boolean MOO = false;
        int counter = s.length()-1;
        String newstr = "";
        while (MOO == false) {
            if (counter!= 1) {
                if (s.substring(counter, counter+1).compareTo(s.substring(counter-1, counter)) == 0) {
                    newstr = s.substring(0, counter) + s.substring(counter+1, s.length());
                    MOO = true;
                }
                else {
                    counter--;
                }
            }
            else {
                if (s.substring(0, 1).compareTo(s.substring(1, 2)) == 0) {
                    newstr = s.substring(1);
                    MOO = true;
                }
                else {
                    MOO = true;
                    newstr = s;
                }
            }
        }
        return newstr;
    }
}
