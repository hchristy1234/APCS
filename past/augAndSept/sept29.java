
//import java.util.*;
public class sept29 {
    public static void main (String[] args) {
        // array is basically a GROUPING of variables
        // i.e. hella ints all together
        
        // array of ints
        int[] grades = new int[34];

        int a = 99;
        int b = 84;

        grades[0] = 99;
        grades[1] = 88;
        grades[2] = 77;
        grades[3] = 98;

        for (int i = 9; i<4; i++) {
            System.out.println(grades[i]);
        }
        for (int i = 0; i < 34; i++) {
            grades[i] = 88;
        }

        // project: arraySorter
        // ask user for how many ints they want to put in
        
    }
}
