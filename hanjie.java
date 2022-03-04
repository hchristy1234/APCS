import java.util.*;
public class hanjie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] board = new int[10][10];
    }
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
