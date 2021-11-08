import java.util.*;
public class connectFour {
    public static void main(String[] args) {
        // once someone wins, say who won
        // if a column fills up and they try to go there, tell them to pick another column
        Scanner scan = new Scanner(System.in);
        int[][] board = new int[6][7];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                board[i][j] = 0;
            }
        }
        // print starting board
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        boolean playing = true;
	   // keeps count of which index each column is at
        int[] columnAt = new int[7];
        for (int i = 0; i <= 6; i++) {
            columnAt[i] = 5;
        }

        int player = 1;
        int counter = 0;

        while (playing == true) {
            boolean choose = true;
            while (choose == true) {
                System.out.println("player #" + player + ": which column would you like to choose? choose a number 1-7");
                int column = scan.nextInt();
                scan.nextLine();
                if (columnAt[column-1] != -1) {
                    int columnNum = columnAt[column-1];
                    board[columnNum][column-1] = player;
                    player = player%2 + 1;
                    columnAt[column-1] -= 1;
                    choose = false;
                    counter++;
                }
                else {
                    System.out.println("That column is full. please choose again.");
                }
            }
            // print board
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 6; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            // check row wins
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 3; j++) {
                    if (board[i][j] != 0 && board[i][j] == board[i][j+1] && board[i][j+1] == board[i][j+2] && board[i][j+2] == board[i][j+3]) {
                        playing = false;
                    }
                }
            }
            // check column wins
            for (int j = 0; j <= 6; j++) {
                for (int i = 0; i <= 2; i++) {
                    if (board[i][j] != 0 && board[i][j] == board[i+1][j] && board[i+1][j] == board[i+2][j] && board[i+2][j] == board[i+3][j]) {
                        playing = false;
                    }
                }
            }
            // check right diagonal wins
            for (int i = 0; i <= 2; i++) {
                for (int j = 3; j <= 6; j++) {
                    if (board[i][j] != 0 && board[i][j] == board[i+1][j-1] && board[i+1][j-1] == board[i+2][j-2] && board[i+2][j-2] == board[i+3][j-3]) {
                        playing = false;
                    }
                }
            }
            // check left diagonal wins
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 3; j++) {
                    if (board[i][j] != 0 && board[i][j] == board[i+1][j+1] && board[i+1][j+1] == board[i+2][j+2] && board[i+2][j+2] == board[i+3][j+3]) {
                        playing = false;
                    }
                }
            }
            // check if board is full
            if (counter == 42) {
                playing = false;
            }
        }
        if (counter != 42) {
            player = player%2 + 1;
            System.out.println("congrats player#" + player);
        }
        else {
            System.out.println("there was a tie");
        }
    }
}
