import java.util.*;

public class tictactoe {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    // all different spots and variables
    int turns = 0;
    char spot1 = '1';
    char spot2 = '2';
    char spot3 = '3';
    char spot4 = '4';
    char spot5 = '5';
    char spot6 = '6';
    char spot7 = '7';
    char spot8 = '8';
    char spot9 = '9';
    int player = 1;
    boolean winner = false;

    // while 9 turns have not happened yet there is no winner yet
    while (turns <9 && winner != true) {
      // prints board
      System.out.println(spot1 + " | " + spot2 + " | " + spot3);
      System.out.println("---------");
      System.out.println(spot4 + " | " + spot5 + " | " + spot6);
      System.out.println("---------");
      System.out.println(spot7 + " | " + spot8 + " | " + spot9);

      // gets user input
      System.out.println("Player " + player + ", please choose a spot!");
      int chosen = scan.nextInt();
      scan.nextLine();

      // fills up the spot in the tictactoe grid based on what the user picks
      if (chosen == 1) {
        if (player == 1) {
          spot1 = 'X';
        }
        else {
          spot1 = 'O';
        }
      }
      else if (chosen == 2) {
        if (player == 1) {
          spot2 = 'X';
        }
        else {
          spot2 = 'O';
        }
      }
      else if (chosen == 3) {
        if (player == 1) {
          spot3 = 'X';
        }
        else {
          spot3 = 'O';
        }
      }
      else if (chosen == 4) {
        if (player == 1) {
          spot4 = 'X';
        }
        else {
          spot4 = 'O';
        }
      }
      else if (chosen == 5) {
        if (player == 1) {
          spot5 = 'X';
        }
        else {
          spot5 = 'O';
        }
      }
      else if (chosen == 6) {
        if (player == 1) {
          spot6 = 'X';
        }
        else {
          spot6 = 'O';
        }
      }
      else if (chosen == 7) {
        if (player == 1) {
          spot7 = 'X';
        }
        else {
          spot7 = 'O';
        }
      }
      else if (chosen == 8) {
        if (player == 1) {
          spot8 = 'X';
        }
        else {
          spot8 = 'O';
        }
      }
      else {
        if (player == 1) {
          spot9 = 'X';
        }
        else {
          spot9 = 'O';
        }
      }

      // checks for winning conditions
      if (spot1 == spot2 && spot2 == spot3) {
        winner = true;
      }
      else if (spot4 == spot5 && spot5 == spot6) {
        winner = true;
      }
      else if (spot7 == spot8 && spot8 == spot9) {
        winner = true;
      }
      else if (spot1 == spot4 && spot4 == spot7) {
        winner = true;
      }
      else if (spot2 == spot5 && spot5 == spot8) {
        winner = true;
      }
      else if (spot3 == spot6 && spot6 == spot9) {
        winner = true;
      }
      else if (spot1 == spot5 && spot5 == spot9) {
        winner = true;
      }
      else if (spot3 == spot5 && spot5 == spot7) {
        winner = true;
      }

      // switches player
      if (player == 1) {
        player = 2;
      }
      else {
        player = 1;
      }
      // counts turns
      turns++;
    }
    // prints the board after someone wins
    System.out.println(spot1 + " | " + spot2 + " | " + spot3);
    System.out.println("---------");
    System.out.println(spot4 + " | " + spot5 + " | " + spot6);
    System.out.println("---------");
    System.out.println(spot7 + " | " + spot8 + " | " + spot9);

    // checks who the winner is
    if (winner == true) {
      if (player == 1){
        System.out.println("we have a winner! congrats player 2");
      }
      else {
        System.out.println("we have a winner! congrats player 1");
      }
    }
    // in the case where no one wins
    else {
      System.out.println("no one won lol");
    }
  }
}
