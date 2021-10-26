import java.util.*;
public class twodArrays {
    public static void main(String[] args) {
        // int[][] x = new int[2][3]
        // [[1, 2, 3], [4, 5, 6]];
        // access 5: x[1][1]
        // first number: number of rows
        // second number: across

        // declare a 2d array
        String[][] x = new String[5][5];

        // populate with X's
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                x[i][j] = "X";
            }
        }

        // setting coordinates and changing value on coordinate table
        x[2][2] = "S";
        x[3][4] = "J";
        x[0][1] = "B";

        // display array
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
