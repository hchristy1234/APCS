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
        String[][][] lawns = new String[n][40][40];
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
            System.out.println("paste the lawn here");
            for (int j = 0; j < lengths[i]; j++) {
                String rowOfGrass = scan.nextLine();
                for (int k = 0; k < widths[i]; k++) {
                    lawns[i][j][k] = rowOfGrass.substring(k*2, k*2+1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            lawns = cutLawn(lawns, startingRows[i], startingColumns[i], i);
            for (int z = 0; z < lengths[i] * widths[i]; z++) {
                for (int l = 1; l < lengths[i]-1; l++) {
                    for (int w = 1; w < widths[i]-1; w++) {
                        if (lawns[i][l][w].equals("C") && lawns[i][l+1][w].equals("C") && lawns[i][l-1][w].equals("C") && (lawns[i][l+1][w+1].equals("C") || lawns[i][l+1][w+1].equals(".")) && (lawns[i][l-1][w+1].equals("C") || lawns[i][l-1][w+1].equals(".")) && (lawns[i][l][w+1].equals("C") || lawns[i][l][w+1].equals("."))) {
                            lawns[i][l+1][w+1] = "C";
                            lawns[i][l-1][w+1] = "C";
                            lawns[i][l][w+1] = "C";
                        }
                        if (lawns[i][l][w].equals("C") && lawns[i][l+1][w].equals("C") && lawns[i][l-1][w].equals("C") && (lawns[i][l+1][w-1].equals("C") || lawns[i][l+1][w-1].equals(".")) && (lawns[i][l-1][w-1].equals("C") || lawns[i][l-1][w-1].equals(".")) && (lawns[i][l][w-1].equals("C") || lawns[i][l][w-1].equals("."))) {
                            lawns[i][l+1][w-1] = "C";
                            lawns[i][l-1][w-1] = "C";
                            lawns[i][l][w-1] = "C";
                        }
                        if (lawns[i][l][w].equals("C") && lawns[i][l][w+1].equals("C") && lawns[i][l][w-1].equals("C") && (lawns[i][l-1][w].equals("C") || lawns[i][l-1][w].equals(".")) && (lawns[i][l-1][w+1].equals("C") || lawns[i][l-1][w+1].equals(".")) && (lawns[i][l-1][w-1].equals("C") || lawns[i][l-1][w-1].equals("."))) {
                            lawns[i][l-1][w] = "C";
                            lawns[i][l-1][w+1] = "C";
                            lawns[i][l-1][w-1] = "C";
                        }
                        if (lawns[i][l][w].equals("C") && lawns[i][l][w+1].equals("C") && lawns[i][l][w-1].equals("C") && (lawns[i][l+1][w].equals("C") || lawns[i][l+1][w].equals(".")) && (lawns[i][l+1][w+1].equals("C") || lawns[i][l+1][w+1].equals(".")) && (lawns[i][l+1][w-1].equals("C") || lawns[i][l+1][w-1].equals("."))) {
                            lawns[i][l+1][w] = "C";
                            lawns[i][l+1][w+1] = "C";
                            lawns[i][l+1][w-1] = "C";
                        }
                    }
                }
            }
        }
        printLawns(lawns, lengths, widths, n);
    }
    public static String[][][] cutLawn(String[][][] lawn, int r, int c, int i) {
        if (lawn[i][r][c].equals(".") || lawn[i][r][c].equals("C") && lawn[i][r+1][c].equals(".") || lawn[i][r+1][c].equals("C") && lawn[i][r-1][c].equals(".") || lawn[i][r-1][c].equals("C") && lawn[i][r][c+1].equals(".") || lawn[i][r][c+1].equals("C") && lawn[i][r][c-1].equals(".") || lawn[i][r][c-1].equals("C") && lawn[i][r+1][c+1].equals(".") || lawn[i][r+1][c+1].equals("C") && lawn[i][r-1][c-1].equals(".") || lawn[i][r-1][c-1].equals("C") && lawn[i][r+1][c-1].equals(".") || lawn[i][r+1][c-1].equals("C") && lawn[i][r-1][c+1].equals(".") || lawn[i][r-1][c+1].equals("C")) {
            lawn[i][r][c] = "C";
            lawn[i][r+1][c] = "C";
            lawn[i][r-1][c] = "C";
            lawn[i][r][c+1] = "C";
            lawn[i][r][c-1] = "C";
            lawn[i][r+1][c+1] = "C";
            lawn[i][r-1][c-1] = "C";
            lawn[i][r+1][c-1] = "C";
            lawn[i][r-1][c+1] = "C";
        }
        return lawn;
    }
    public static void printLawns(String[][][] lawns, int[] lengths, int[] widths, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <lengths[i]; j++) {
                for (int k = 0; k < widths[i]; k++) {
                    System.out.print(lawns[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}
