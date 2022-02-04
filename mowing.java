import java.util.*;
public class mowing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many lawns are you mowing?");
        int n = scan.nextInt();
        int[] lengths = new int[n];
        int[] widths = new int[n];
        int[] startingRows = new int[n];
        int[] startingColumns = new int[n];
        String[][][] lawns = new String[2][40][40];
        for (int i = 0; i < n; i++) {
            System.out.println("lawn length");
            lengths[i] = scan.nextInt();
            scan.nextLine();
            System.out.println("lawn width");
            widths[i] = scan.nextInt();
            scan.nextLine();
            System.out.println("starting row");
            startingRows[i] = scan.nextInt();
            scan.nextLine();
            System.out.println("starting column");
            startingColumns[i] = scan.nextInt();
            scan.nextLine();
            for (int j = 0; j < lengths[i]; j++) {
                String rowOfGrass = scan.nextLine();
                for (int k = 0; k < widths[i]; k++) {
                    lawns[i][j][k] = rowOfGrass.substring(k*2, k*2+1);
                }
            }
        }
        // PRINTS THE LAWNS !!!
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <lengths[i]; j++) {
        //         for (int k = 0; k < widths[i]; k++) {
        //             System.out.print(lawns[i][j][k] + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        //     System.out.println();
        // }
    }
    public static String[][] cutLawn(String[][] lawn, int r, int c) {
        if (lawn[r][c].equals(".") || lawn[r][c].equals("C") && lawn[r+1][c].equals(".") || lawn[r+1][c].equals("C") && lawn[r-1][c].equals(".") || lawn[r-1][c].equals("C") && lawn[r][c+1].equals(".") || lawn[r][c+1].equals("C") && lawn[r][c-1].equals(".") || lawn[r][c-1].equals("C") && lawn[r+1][c+1].equals(".") || lawn[r+1][c+1].equals("C") && lawn[r-1][c-1].equals(".") || lawn[r-1][c-1].equals("C") && lawn[r+1][c-1].equals(".") || lawn[r+1][c-1].equals("C") && lawn[r-1][c+1].equals(".") || lawn[r-1][c+1].equals("C")) {
            lawn[r][c] = "C";
            lawn[r+1][c] = "C";
            lawn[r-1][c] = "C";
            lawn[r][c+1] = "C";
            lawn[r][c-1] = "C";
            lawn[r+1][c+1] = "C";
            lawn[r-1][c-1] = "C";
            lawn[r+1][c-1] = "C";
            lawn[r-1][c+1] = "C";
        }
        return lawn;
    }
}
