import java.util.*;
public class checkers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pieces[][] board = new pieces[8][8];
        System.out.println("WELCOME TO CHECKERS!");
        System.out.println("red is xx, white is oo\nred king is xK, white king is oK\nto capture multiple pieces in one move, please make one capture at a time");
        System.out.println("HAVE FUN!");

        // place white pieces
        int temp = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (j%2 == temp) {
                    board[i][j] = new pieces(i, j, false, "red");
                }
                else {
                    board[i][j] = new pieces(i, j, false, "none");
                }
            }
            temp = Math.abs(temp-1);
        }
        // place 2 middle rows
        for (int i = 3; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new pieces(i, j, false, "none");
            }
        }
        // place red pieces
        temp = 0;
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j%2 == temp) {
                    board[i][j] = new pieces(i, j, false, "white");
                }
                else {
                    board[i][j] = new pieces(i, j, false, "none");
                }
            }
            temp = Math.abs(temp-1);
        }
        printBoard(board);

        boolean done = false;
        String player = "red"; // x is red. o is white.
        while (done == false) {
            boolean moveDone = false;
            // while a move is not finished (eg invalid) it just keeps asking player to choose a move
            while (moveDone == false) {
                System.out.println("it is " + player + "'s turn. \nnote: if you are capturing multiple pieces, please do it one jump at a time (you will automatically be asked to select your next move afterwards, until you run out of captures).");
                System.out.println("o is white. x is red.");
                System.out.println("row of piece you want to move:");
                int x1 = scan.nextInt();
                scan.nextLine();
                System.out.println("column of piece you want to move:");
                int y1 = scan.nextInt();
                scan.nextLine();
                System.out.println("row of place you want to move piece to:");
                int x2 = scan.nextInt();
                scan.nextLine();
                System.out.println("column of place you want to move piece to:");
                int y2 = scan.nextInt();
                scan.nextLine();
                if (x1 >= 0 && x1 <= 7 && x2 >= 0 && x2 <= 7 && y1 >= 0 && y1 <= 7 && y2 >= 0 && y2 <= 7 && board[x1][y1].getColor().equals(player) && board[x2][y2].getColor().equals("none")) {
                    if (player.equals("red") && board[x1][y1].kingStatus() == false) {
                        if (x2 == x1+1 && ((y2 == y1-1) || (y2 == y1+1))) {
                            board[x1][y1].setColor("none");
                            board[x2][y2].setColor("red");
                            if (x2 == 7) {
                                board[x2][y2].makeKing(true);
                            }
                            moveDone = true;
                        }
                        else if (x1<=6 && y1>=1 && x2 == x1+2 && y2 == y1-2 && board[x1+1][y1-1].getColor().equals("white")) {
                            board[x1][y1].setColor("none");
                            board[x2][y2].setColor("red");
                            board[x1+1][y1-1].setColor("none");
                            boolean capturePossible = true;
                            x1 = x2;
                            y1 = y2;
                            while (capturePossible) {
                                if ((x1 <=5 && y1<=5 && board[x1+1][y1+1].getColor().equals("white") && board[x1+2][y1+2].getColor().equals("none")) || (x1<=5 && y1>=2 && board[x1+1][y1-1].getColor().equals("white") && board[x1+2][y1-2].getColor().equals("none"))) {
                                    printBoard(board);
                                    System.out.println("a capture is possible so u must continue capturing. you are moving the piece at row " + x1 + " and column " + y1);
                                    System.out.println("row of place you want to move piece to:");
                                    x2 = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("column of place you want to move piece to:");
                                    y2 = scan.nextInt();
                                    scan.nextLine();
                                    if (x2 >= 0 && x2 <= 7 && y2>=0 && y2<=7 && ((x1<=5 && y1>=2 && x2 == x1+2 && y2 == y1-2 && board[x1+1][y1-1].getColor().equals("white") && board[x1+2][y1-2].getColor().equals("none")) || (x2 == x1+2 && y2 == y1+2 && x1<=5 && y1<=5 && board[x1+1][y1+1].getColor().equals("white") && board[x1+2][y1+2].getColor().equals("none")))) {
                                        board[x1][y1].setColor("none");
                                        board[x2][y2].setColor("red");
                                        if (y2 < y1) {
                                            board[x1+1][y1-1].setColor("none");
                                        }
                                        else {
                                            board[x1+1][y1+1].setColor("none");
                                        }
                                        x1 = x2;
                                        y1 = y2;
                                    }
                                    else {
                                        System.out.println("invalid move. try again.");
                                    }
                                }
                                else {
                                    capturePossible = false;
                                }
                            }
                            if (x2 == 7) {
                                board[x2][y2].makeKing(true);
                            }
                            moveDone = true;
                        }
                        else if (x1<=6 && y1<=6 && x2 == x1+2 && y2 == y1+2 && board[x1+1][y1+1].getColor().equals("white")) {
                            board[x1][y1].setColor("none");
                            board[x2][y2].setColor("red");
                            board[x1+1][y1+1].setColor("none");
                            boolean capturePossible = true;
                            x1 = x2;
                            y1 = y2;
                            while (capturePossible) {
                                if ((x1<=5 && y1<=5 && board[x1+1][y1+1].getColor().equals("white") && board[x1+2][y1+2].getColor().equals("none")) || (x1<=5 && y1>=2 && board[x1+1][y1-1].getColor().equals("white") && board[x1+2][y1-2].getColor().equals("none"))) {
                                    printBoard(board);
                                    System.out.println("a capture is possible so u must continue capturing. you are moving the piece at row " + x1 + " and column " + y1);
                                    System.out.println("row of place you want to move piece to:");
                                    x2 = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("column of place you want to move piece to:");
                                    y2 = scan.nextInt();
                                    scan.nextLine();
                                    if (x2 >= 0 && x2 <= 7 && y2>=0 && y2<=7 && ((x1<=5 && y1>=2 && x2 == x1+2 && y2 == y1-2 && board[x1+1][y1-1].getColor().equals("white") && board[x1+2][y1-2].getColor().equals("none")) || (x1<=5 && y1<=5 && x2 == x1+2 && y2 == y1+2 && board[x1+1][y1+1].getColor().equals("white") && board[x1+2][y1+2].getColor().equals("none")))) {
                                        board[x1][y1].setColor("none");
                                        board[x2][y2].setColor("red");
                                        if (y2 < y1) {
                                            board[x1+1][y1-1].setColor("none");
                                        }
                                        else {
                                            board[x1+1][y1+1].setColor("none");
                                        }
                                        x1 = x2;
                                        y1 = y2;
                                    }
                                    else {
                                        System.out.println("invalid move. try again.");
                                    }
                                }
                                else {
                                    capturePossible = false;
                                }
                            }
                            if (x2 == 7) {
                                board[x2][y2].makeKing(true);
                            }
                            moveDone = true;
                        }
                        else {
                            System.out.println("invalid move.");
                        }
                    }
                    else if (player.equals("white") && board[x1][y1].kingStatus() == false) {
                        if (x2 == x1-1 && (y2 == y1-1 || y2 == y1+1)) {
                            board[x1][y1].setColor("none");
                            board[x2][y2].setColor("white");
                            if (x2 == 0) {
                                board[x2][y2].makeKing(true);
                            }
                            moveDone = true;
                        }
                        else if (x1>=1 && y1>=1 && x2 == x1-2 && y2 == y1-2 && board[x1-1][y1-1].getColor().equals("red")) {
                            board[x1][y1].setColor("none");
                            board[x2][y2].setColor("white");
                            board[x1-1][y1-1].setColor("none");
                            boolean capturePossible = true;
                            x1 = x2;
                            y1 = y2;
                            while (capturePossible) {
                                if ((x1>=2 && y1<=5 && board[x1-1][y1+1].getColor().equals("red") && board[x1-2][y1+2].getColor().equals("none")) || (x1>=2 && y1>=2 && board[x1-1][y1-1].getColor().equals("red") && board[x1-2][y1-2].getColor().equals("none"))) {
                                    printBoard(board);
                                    System.out.println("a capture is possible so u must continue capturing. you are moving the piece at row " + x1 + " and column " + y1);
                                    System.out.println("row of place you want to move piece to:");
                                    x2 = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("column of place you want to move piece to:");
                                    y2 = scan.nextInt();
                                    scan.nextLine();
                                    if (x2 >= 0 && x2 <= 7 && y2>=0 && y2<=7 && ((x1>=2 && y1>=2 && x2 == x1-2 && y2 == y1-2 && board[x1-1][y1-1].getColor().equals("red") && board[x1-2][y1-2].getColor().equals("none")) || (x1>=2 && y1<=5 && x2 == x1-2 && y2 == y1+2 && board[x1-1][y1+1].getColor().equals("red") && board[x1-2][y1+2].getColor().equals("none")))) {
                                        board[x1][y1].setColor("none");
                                        board[x2][y2].setColor("white");
                                        if (y2 < y1) {
                                            board[x1-1][y1-1].setColor("none");
                                        }
                                        else {
                                            board[x1-1][y1+1].setColor("none");
                                        }
                                        x1 = x2;
                                        y1 = y2;
                                    }
                                    else {
                                        System.out.println("invalid move. try again.");
                                    }
                                }
                                else {
                                    capturePossible = false;
                                }
                            }
                            if (x2 == 0) {
                                board[x2][y2].makeKing(true);
                            }
                            moveDone = true;
                        }
                        else if (x1>=1 && y1<=6 && x2 == x1-2 && y2 == y1+2 && board[x1-1][y1+1].getColor().equals("red")) {
                            board[x1][y1].setColor("none");
                            board[x2][y2].setColor("white");
                            board[x1-1][y1+1].setColor("none");
                            boolean capturePossible = true;
                            x1 = x2;
                            y1 = y2;
                            while (capturePossible) {
                                if ((x1>=2 && y1<=5 && board[x1-1][y1+1].getColor().equals("red") && board[x1-2][y1+2].getColor().equals("none")) || (x1>=2 && y1>=2 && board[x1-1][y1-1].getColor().equals("red") && board[x1-2][y1-2].getColor().equals("none"))) {
                                    printBoard(board);
                                    System.out.println("a capture is possible so u must continue capturing. you are moving the piece at row " + x1 + " and column " + y1);
                                    System.out.println("row of place you want to move piece to:");
                                    x2 = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("column of place you want to move piece to:");
                                    y2 = scan.nextInt();
                                    scan.nextLine();
                                    if (x2 >= 0 && x2 <= 7 && y2>=0 && y2<=7 && ((x1>=2 && y1>=2 && x2 == x1-2 && y2 == y1-2 && board[x1-1][y1-1].getColor().equals("red") && board[x1-2][y1-2].getColor().equals("none")) || (x1>=2 && y1<=5 && x2 == x1-2 && y2 == y1+2 && board[x1-1][y1+1].getColor().equals("red") && board[x1-2][y1+2].getColor().equals("none")))) {
                                        board[x1][y1].setColor("none");
                                        board[x2][y2].setColor("white");
                                        if (y2 < y1) {
                                            board[x1-1][y1-1].setColor("none");
                                        }
                                        else {
                                            board[x1-1][y1+1].setColor("none");
                                        }
                                        x1 = x2;
                                        y1 = y2;
                                    }
                                    else {
                                        System.out.println("invalid move. try again.");
                                    }
                                }
                                else {
                                    capturePossible = false;
                                }
                            }
                            if (x2 == 0) {
                                board[x2][y2].makeKing(true);
                            }
                            moveDone = true;
                        }
                        else {
                            System.out.println("invalid move.");
                        }
                    }
                    // king conditions
                    else if (player.equals("red") && board[x1][y1].kingStatus() == true) {
                        if ((x2 == x1-1 || x2 == x1+1) && (y2 == y1-1 || y2 == y1+1)) {
                            board[x1][y1].setColor("none");
                            board[x1][y1].makeKing(false);
                            board[x2][y2].setColor("red");
                            board[x2][y2].makeKing(true);
                            moveDone = true;
                        }
                        else if (x1 >=1 && y1>=1 && x2 == x1-2 && y2 == y1-2 && board[x1-1][y1-1].getColor().equals("white") || x1>=1 && y1<=6 && x2 == x1-2 && y2 == y1+2 && board[x1-1][y1+1].getColor().equals("white") || x1<=6 && y1>=1 && x2 == x1+2 && y2 == y1-2 && board[x1+1][y1-1].getColor().equals("white") || x1<=6 && y1<=6 && x2 == x1+2 && y2 == y1+2 && board[x1+1][y1+1].getColor().equals("white")) {
                            board[x1][y1].setColor("none");
                            board[x1][y1].makeKing(false);
                            board[x2][y2].setColor("red");
                            board[x2][y2].makeKing(true);
                            if (x2 > x1 && y2 > y1) {
                                board[x1+1][y1+1].setColor("none");
                                board[x1+1][y1+1].makeKing(false);
                            }
                            else if (x2 < x1 && y2 > y1) {
                                board[x1-1][y1+1].setColor("none");
                                board[x1-1][y1+1].makeKing(false);
                            }
                            else if (x2 > x1 && y2 < y1) {
                                board[x1+1][y1-1].setColor("none");
                                board[x1+1][y1-1].makeKing(false);
                            }
                            else if (x2 < x1 && y2 < y1) {
                                board[x1-1][y1-1].setColor("none");
                                board[x1-1][y1-1].makeKing(false);
                            }
                            boolean capturePossible = true;
                            x1 = x2;
                            y1 = y2;
                            while (capturePossible) {
                                if ((x1<=5 && y1<=5 && board[x1+1][y1+1].getColor().equals("white") && board[x1+2][y1+2].getColor().equals("none")) || (x1>=2 && y1<=5 && board[x1-1][y1+1].getColor().equals("white") && board[x1-2][y1+2].getColor().equals("none")) || (x1<=5 && y1>=2 && board[x1+1][y1-1].getColor().equals("white") && board[x1+2][y1-2].getColor().equals("none")) || (x1>=2 && y1>=2 && board[x1-1][y1-1].getColor().equals("white") && board[x1-2][y1-2].getColor().equals("none"))) {
                                    printBoard(board);
                                    System.out.println("a capture is possible so u must continue capturing. you are moving the piece at row " + x1 + " and column " + y1);
                                    System.out.println("row of place you want to move piece to:");
                                    x2 = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("column of place you want to move piece to:");
                                    y2 = scan.nextInt();
                                    scan.nextLine();
                                    if (x2 >= 0 && x2 <= 7 && y2>=0 && y2<=7 && (x1 >=2 && y1>=2 && x2 == x1-2 && y2 == y1-2 && board[x1-1][y1-1].getColor().equals("white") && board[x1-2][y1-2].getColor().equals("none") || x1>=2 && y1<=5 && x2 == x1-2 && y2 == y1+2 && board[x1-1][y1+1].getColor().equals("white") && board[x1-2][y1+2].getColor().equals("none") || x1<=5 && y1>=2 && x2 == x1+2 && y2 == y1-2 && board[x1+1][y1-1].getColor().equals("white") && board[x1+2][y1+2].getColor().equals("none") || x1<=5 && y1<=5 && x2 == x1+2 && y2 == y1+2 && board[x1+1][y1+1].getColor().equals("white") && board[x1+2][y1+2].getColor().equals("none"))) {
                                        board[x1][y1].setColor("none");
                                        board[x1][y1].makeKing(false);
                                        board[x2][y2].setColor("red");
                                        board[x2][y2].makeKing(true);
                                        if (x2 > x1 && y2 > y1) {
                                            board[x1+1][y1+1].setColor("none");
                                            board[x1+1][y1+1].makeKing(false);
                                        }
                                        else if (x2 < x1 && y2 > y1) {
                                            board[x1-1][y1+1].setColor("none");
                                            board[x1-1][y1+1].makeKing(false);
                                        }
                                        else if (x2 > x1 && y2 < y1) {
                                            board[x1+1][y1-1].setColor("none");
                                            board[x1+1][y1-1].makeKing(false);
                                        }
                                        else if (x2 < x1 && y2 < y1) {
                                            board[x1-1][y1-1].setColor("none");
                                            board[x1-1][y1-1].makeKing(false);
                                        }
                                        x1 = x2;
                                        y1 = y2;
                                    }
                                    else {
                                        System.out.println("invalid move.");
                                    }
                                }
                                else {
                                    capturePossible = false;
                                }
                            }
                            moveDone = true;
                        }
                    }

                    // white king
                    else if (player.equals("white") && board[x1][y1].kingStatus() == true) {
                        // regular jumping forward/backward
                        if ((x2 == x1-1 || x2 == x1+1) && (y2 == y1-1 || y2 == y1+1)) {
                            board[x1][y1].setColor("none");
                            board[x1][y1].makeKing(false);
                            board[x2][y2].setColor("white");
                            board[x2][y2].makeKing(true);
                            moveDone = true;
                        }
                        // capturing pieces
                        else if (x1 >=1 && y1>=1 && x2 == x1-2 && y2 == y1-2 && board[x1-1][y1-1].getColor().equals("red") || x1>=1 && y1<=6 && x2 == x1-2 && y2 == y1+2 && board[x1-1][y1+1].getColor().equals("red") || x1<=6 && y1>=1 && x2 == x1+2 && y2 == y1-2 && board[x1+1][y1-1].getColor().equals("red") || x1<=6 && y1<=6 && x2 == x1+2 && y2 == y1+2 && board[x1+1][y1+1].getColor().equals("red")) {
                            board[x1][y1].setColor("none");
                            board[x1][y1].makeKing(false);
                            board[x2][y2].setColor("white");
                            board[x2][y2].makeKing(true);
                            if (x2 > x1 && y2 > y1) {
                                board[x1+1][y1+1].setColor("none");
                                board[x1+1][y1+1].makeKing(false);
                            }
                            else if (x2 < x1 && y2 > y1) {
                                board[x1-1][y1+1].setColor("none");
                                board[x1-1][y1+1].makeKing(false);
                            }
                            else if (x2 > x1 && y2 < y1) {
                                board[x1+1][y1-1].setColor("none");
                                board[x1+1][y1-1].makeKing(false);
                            }
                            else if (x2 < x1 && y2 < y1) {
                                board[x1-1][y1-1].setColor("none");
                                board[x1-1][y1-1].makeKing(false);
                            }
                            boolean capturePossible = true;
                            x1 = x2;
                            y1 = y2;
                            // force player to continue capturing pieces
                            while (capturePossible) {
                                if ((x1<=5 && y1<=5 && board[x1+1][y1+1].getColor().equals("red") && board[x1+2][y1+2].getColor().equals("none")) || (x1>=2 && y1<=5 && board[x1-1][y1+1].getColor().equals("red") && board[x1-2][y1+2].getColor().equals("none")) || (x1<=5 && y1>=2 && board[x1+1][y1-1].getColor().equals("red") && board[x1+2][y1-2].getColor().equals("none")) || (x1>=2 && y1>=2 && board[x1-1][y1-1].getColor().equals("red") && board[x1-2][y1-2].getColor().equals("none"))) {
                                    printBoard(board);
                                    System.out.println("a capture is possible so u must continue capturing. you are moving the piece at row " + x1 + " and column " + y1);
                                    System.out.println("row of place you want to move piece to:");
                                    x2 = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("column of place you want to move piece to:");
                                    y2 = scan.nextInt();
                                    scan.nextLine();
                                    if (x2 >= 0 && x2 <= 7 && y2>=0 && y2<=7 && (x1 >=2 && y1>=2 && x2 == x1-2 && y2 == y1-2 && board[x1-1][y1-1].getColor().equals("red") && board[x1-2][y1-2].getColor().equals("none") || x1>=2 && y1<=5 && x2 == x1-2 && y2 == y1+2 && board[x1-1][y1+1].getColor().equals("red") && board[x1-2][y1+2].getColor().equals("none") || x1<=5 && y1>=2 && x2 == x1+2 && y2 == y1-2 && board[x1+1][y1-1].getColor().equals("red") && board[x1+2][y1-2].getColor().equals("none") || x1<=5 && y1<=5 && x2 == x1+2 && y2 == y1+2 && board[x1+1][y1+1].getColor().equals("red") && board[x1+2][y1+2].getColor().equals("none"))) {
                                        board[x1][y1].setColor("none");
                                        board[x1][y1].makeKing(false);
                                        board[x2][y2].setColor("white");
                                        board[x2][y2].makeKing(true);
                                        if (x2 > x1 && y2 > y1) {
                                            board[x1+1][y1+1].setColor("none");
                                            board[x1+1][y1+1].makeKing(false);
                                        }
                                        else if (x2 < x1 && y2 > y1) {
                                            board[x1-1][y1+1].setColor("none");
                                            board[x1-1][y1+1].makeKing(false);
                                        }
                                        else if (x2 > x1 && y2 < y1) {
                                            board[x1+1][y1-1].setColor("none");
                                            board[x1+1][y1-1].makeKing(false);
                                        }
                                        else if (x2 < x1 && y2 < y1) {
                                            board[x1-1][y1-1].setColor("none");
                                            board[x1-1][y1-1].makeKing(false);
                                        }
                                        x1 = x2;
                                        y1 = y2;
                                    }
                                    else {
                                        System.out.println("invalid move.");
                                    }
                                }
                                else {
                                    capturePossible = false;
                                }
                            }
                            moveDone = true;
                        }
                    }
                }
                else {
                    System.out.println("invalid move.");
                }
            }
            // win conditions
            boolean redPiecesRemain = false;
            boolean whitePiecesRemain = false;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j].getColor().equals("red")) {
                        redPiecesRemain = true;
                    }
                    if (board[i][j].getColor().equals("white")) {
                        whitePiecesRemain = true;
                    }
                }
            }
            // if no more red pieces
            if (!redPiecesRemain) {
                System.out.println("No more red pieces remain. Congrats white!");
                done = true;
            }
            // if no more white pieces
            if (!whitePiecesRemain) {
                System.out.println("No more white pieces remain. Congrats red!");
                done = true;
            }

            boolean redStuck = true;
            boolean whiteStuck = true;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j].getColor().equals("red")) {
                        if (board[i][j].kingStatus() == true) {
                            if (i<=6 && j<=6 && board[i+1][j+1].getColor().equals("none") || i<=6 && j>=1 && board[i+1][j-1].getColor().equals("none") || i>=1 && j<=6 && board[i-1][j+1].getColor().equals("none") || i>=1 && j>=1 && board[i-1][j-1].getColor().equals("none")) {
                                redStuck = false;
                            }
                            else if (i<=5 && j<=5 && board[i+1][j+1].getColor().equals("white") && board[i+2][j+2].getColor().equals("none") || i<=5 && j>=2 && board[i+1][j-1].getColor().equals("white") && board[i+2][j-2].getColor().equals("none") || i>=2 && j<=5 && board[i-1][j+1].getColor().equals("white") && board[i-2][j+2].getColor().equals("none") || i>=2 && j>=2 && board[i-1][j-1].getColor().equals("white") && board[i-2][j-2].getColor().equals("none")) {
                                redStuck = false;
                            }
                        }
                        else {
                            if (i <=6 && j >=1 && board[i+1][j-1].getColor().equals("none") || i<=6 && j<=6 && board[i+1][j+1].getColor().equals("none")) {
                                redStuck = false;
                            }
                            else if (i<=5 && j>=2 && board[i+1][j-1].getColor().equals("white") && board[i+2][j-2].getColor().equals("none") || i<=5 && j<=5 && board[i+1][j+1].getColor().equals("white") && board[i+2][j+2].getColor().equals("none")) {
                                redStuck = false;
                            }
                        }
                    }
                    else if (board[i][j].getColor().equals("white")) {
                        if (board[i][j].kingStatus() == true) {
                            if (i<=6 && j<=6 && board[i+1][j+1].getColor().equals("none") || i<=6 && j>=1 && board[i+1][j-1].getColor().equals("none") || i>=1 && j<=6 && board[i-1][j+1].getColor().equals("none") || i>=1 && j>=1 && board[i-1][j-1].getColor().equals("none")) {
                                whiteStuck = false;
                            }
                            else if (i<=5 && j<=5 && board[i+1][j+1].getColor().equals("red") && board[i+2][j+2].getColor().equals("none") || i<=5 && j>=2 && board[i+1][j-1].getColor().equals("red") && board[i+2][j-2].getColor().equals("none") || i>=2 && j<=5 && board[i-1][j+1].getColor().equals("red") && board[i-2][j+2].getColor().equals("none") || i>=2 && j>=2 && board[i-1][j-1].getColor().equals("red") && board[i-2][j-2].getColor().equals("none")) {
                                whiteStuck = false;
                            }
                        }
                        else {
                            if (i>=1 && j>=1 && board[i-1][j-1].getColor().equals("none") || i>=1 && j<=6 && board[i-1][j+1].getColor().equals("none")) {
                                whiteStuck = false;
                            }
                            else if (i>=2 && j>=2 && board[i-1][j-1].getColor().equals("red") && board[i-2][j-2].getColor().equals("none") || i>=2 && j<=5 && board[i-1][j+1].getColor().equals("red") && board[i-2][j+2].getColor().equals("none")) {
                                whiteStuck = false;
                            }
                        }
                    }
                }
            }
            if (redStuck) {
                System.out.println("red has no more moves available. congrats white!");
                done = true;
            }
            if (whiteStuck) {
                System.out.println("white has no more moves available. congrats red!");
                done = true;
            }

            // switch player
            if (player.equals("red")) {
                player = "white";
            }
            else {
                player = "red";
            }
            printBoard(board);
        }
    }

    public static void printBoard(pieces[][] board) {
        System.out.println("    0  1  2  3  4  5  6  7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < 8; j++) {
                if (board[i][j].getColor().equals("white")) {
                    if (board[i][j].kingStatus() == true) {
                        System.out.print("oK|");
                    }
                    else {
                        System.out.print("oo|");
                    }
                }
                else if (board[i][j].getColor().equals("red")) {
                    if (board[i][j].kingStatus() == true) {
                        System.out.print("xK|");
                    }
                    else {
                        System.out.print("xx|");
                    }
                }
                else {
                    System.out.print("__|");
                }
            }
            System.out.println();
        }
    }
}