import java.util.*;
public class hanjie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] board = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = "O";
            }
        }
        // these are the values on the side since i'm too lazy to take them in as user input
        int[][] columnVals2 = {{0,3,1}, {0,0,2},{0,0,3},{0,2,4},{0,5,4},{0,5,4},{0,2,4},{0,0,3},{0,0,2},{3,1,1}};
        int[][] rowVals2 = {{1,4,1},{1,4,1},{1,2,1},{0,0,2},{0,0,2},{0,0,0},{0,0,4},{0,6,1},{0,0,8},{0,0,10}};
        String[][] returnedBoard = recurseBoard(board, columnVals2, rowVals2, 0, 0);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(returnedBoard[i][j]);
            }
            System.out.println();
        }
    }
    // this checks whether the condition of the hanjie values are met
    public static boolean checkValid(String[][] board, int[][] columnVals2, int[][] rowVals2) {
        // checking columns
        int colCounter = 0;
        int cvCheckCounter = 0;
        String prev = "Z";
        for (int i = 0; i < 10; i++) {
            // makes sure that it doesn't account for the 0's
            if(columnVals2[i][0] == 0) {
                cvCheckCounter = 1;
            }
            if (columnVals2[i][1] == 0) {
                cvCheckCounter = 2;
            }
            if (columnVals2[i][2] == 0) {
                cvCheckCounter = 3;
            }
            for (int j = 0; j < 10; j++) {
                if (!prev.equals("X")) {
                    colCounter = 0;
                }
                else if(board[j][i].equals("X")) {
                    colCounter++;
                }
                if (cvCheckCounter!=3 && colCounter == columnVals2[i][cvCheckCounter] && !board[j+1][i].equals("X")) {
                    cvCheckCounter++;
                }
                prev = board[j][i];
            }
            if (cvCheckCounter!=3) {
                return false;
            }
        }

        // checking rows
        int rowCounter = 0;
        int rvCheckCounter = 0;
        prev = "Z";
        for (int i = 0; i < 10; i++) {
            if(rowVals2[i][0] == 0) {
                rvCheckCounter = 1;
            }
            if (rowVals2[i][1] == 0) {
                rvCheckCounter = 2;
            }
            if (rowVals2[i][2] == 0) {
                rvCheckCounter = 3;
            }
            for (int j = 0; j < 10; j++) {
                if (!prev.equals("X")) {
                    rowCounter = 0;
                }
                else if(board[i][j].equals("X")) {
                    rowCounter++;
                }
                if (rvCheckCounter!=3 && rowCounter == rowVals2[i][rvCheckCounter] && !board[i][j+1].equals("X")) {
                    rvCheckCounter++;
                }
                prev = board[i][j];
            }
            if (rvCheckCounter!=3) {
                return false;
            }
        }
        return true;
    }
    public static String[][] recurseBoard(String[][] board, int[][] columnVals2, int[][] rowVals2, int currentRow, int currentCol) {
        if (checkValid(board, columnVals2, rowVals2)) {
            return board;
        }
        else {
            if (currentCol == 9) {
                recurseBoard(board, columnVals2, rowVals2, currentRow+1, 0);
            }
            else {
                recurseBoard(board, columnVals2, rowVals2, currentRow, currentCol+1);
            }
            String[][] newboard = new String[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    newboard[i][j] = board[i][j];
                }
            }
            newboard[currentRow][currentCol] = "X";
            recurseBoard(newboard, columnVals2, rowVals2, currentRow, currentCol+1);
        }
        String[][] noFound = {{"nothing found"}};
        return noFound;
    }
}
