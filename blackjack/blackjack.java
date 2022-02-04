import java.util.*;
public class blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Card> ogDeck = new ArrayList<Card>();
        String[] cardTypes = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
        String[] suites = {"clubs", "diamonds", "hearts", "spades"};
        for (int i = 0; i < cardTypes.length; i++) {
            for (int j = 0; j < suites.length; j++) {
                Card temp = new Card(cardTypes[i], suites[j]);
                ogDeck.add(temp);
            }
        }
        Deck theDeck = new Deck(ogDeck);

        System.out.println("WELCOME TO BLACKJACK!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        Player player = new Player(name, 500);
        ArrayList<Card> playerCards = new ArrayList<Card>();
        ArrayList<Card> dealerCards = new ArrayList<Card>();

        boolean playingOn = true;
        while (playingOn) {
            theDeck.shuffle();
            boolean gameOn = true;
            while (playerCards.size() > 0) {
                playerCards.remove(0);
            }
            while (dealerCards.size() > 0) {
                dealerCards.remove(0);
            }
            int bet = 0;
            boolean validBet = false;
            while (!validBet) {
                System.out.println(player.getName() + ", how much do you want to bet?");
                System.out.println("Your current balance is " + player.getBankroll());
                bet = scan.nextInt();
                scan.nextLine();
                if (bet > 0 && bet <= player.getBankroll()) {
                    validBet = true;
                }
                else {
                    System.out.println("That is not a valid bet. Please try again.");
                }
            }
            int c = 0;
            playerCards.add(theDeck.getDeck().get(c));
            c+=1;
            playerCards.add(theDeck.getDeck().get(c));
            c+=1;
            dealerCards.add(theDeck.getDeck().get(c));
            c+=1;
            dealerCards.add(theDeck.getDeck().get(c));
            c+=1;
            while (calculateValue(dealerCards) < 17) {
                dealerCards.add(theDeck.getDeck().get(c));
                c+=1;
            }
            while (gameOn) {
                printCards(playerCards, dealerCards);
                System.out.println(player.getName() + "'s current card value: " + calculateValue(playerCards));
                boolean validMove = false;
                boolean stand = false;
                while (!validMove) {
                    System.out.println("Would you like to hit or stand? \n1 for hit\n2 for stand.");
                    int move = scan.nextInt();
                    scan.nextLine();
                    if (move == 1) {
                        playerCards.add(theDeck.getDeck().get(c));
                        c+=1;
                        validMove = true;
                    }
                    else if (move == 2) {
                        gameOn = false;
                        stand = true;
                        validMove = true;
                    }
                    else {
                        System.out.println("That was not a valid choice.");
                    }
                }
                if (calculateValue(playerCards) > 21 && calculateValue(dealerCards) > 21) {
                    printBothCards(playerCards, dealerCards);
                    System.out.println("Player's value was " + calculateValue(playerCards));
                    System.out.println("Dealer's value was " + calculateValue(dealerCards));
                    System.out.println("Both the player and dealer have busted. Money is pushed back.");
                    gameOn = false;
                }
                else if (calculateValue(playerCards) > 21) {
                    printBothCards(playerCards, dealerCards);
                    System.out.println("Player's value was " + calculateValue(playerCards));
                    System.out.println("Dealer's value was " + calculateValue(dealerCards));
                    System.out.println(player.getName() + " has busted. " + player.getName() + " has lost " + bet);
                    player.setBankroll(player.getBankroll()-bet);
                    gameOn = false;
                }
                else if (calculateValue(playerCards) == 21 && calculateValue(dealerCards) == 21) {
                    printBothCards(playerCards, dealerCards);
                    System.out.println("Player's value was " + calculateValue(playerCards));
                    System.out.println("Dealer's value was " + calculateValue(dealerCards));
                    System.out.println("Both the player and dealer have a blackjack. Money is pushed back.");
                    gameOn = false;
                }
                else if (calculateValue(playerCards) == 21) {
                    printBothCards(playerCards, dealerCards);
                    System.out.println("Player's value was " + calculateValue(playerCards));
                    System.out.println("Dealer's value was " + calculateValue(dealerCards));
                    System.out.println("Congrats, you got a blackjack!");
                    System.out.println("You have earned " + (int)(bet+(bet/2)));
                    player.setBankroll(player.getBankroll()+bet+(bet/2));
                    gameOn = false;
                }
                else if (stand) {
                    if (calculateValue(playerCards) > calculateValue(dealerCards)) {
                        printBothCards(playerCards, dealerCards);
                        System.out.println("Player's value was " + calculateValue(playerCards));
                        System.out.println("Dealer's value was " + calculateValue(dealerCards));
                        System.out.println("Player wins.");
                        player.setBankroll(player.getBankroll()+bet);
                    }
                    else if (calculateValue(playerCards) < calculateValue(dealerCards) && calculateValue(dealerCards) > 21) {
                        printBothCards(playerCards, dealerCards);
                        System.out.println("Player's value was " + calculateValue(playerCards));
                        System.out.println("Dealer's value was " + calculateValue(dealerCards));
                        System.out.println("Dealer has busted. Player wins.");
                        player.setBankroll(player.getBankroll()+bet);
                    }
                    else if (calculateValue(playerCards) < calculateValue(dealerCards)) {
                        printBothCards(playerCards, dealerCards);
                        System.out.println("Player's value was " + calculateValue(playerCards));
                        System.out.println("Dealer's value was " + calculateValue(dealerCards));
                        System.out.println("Player has lost.");
                        player.setBankroll(player.getBankroll()-bet);
                    }
                    gameOn = false;
                }
            }
            System.out.println("Would you like to play again? \n1 for yes. \n2 for no.");
            int playAgain = scan.nextInt();
            scan.nextLine();
            if (playAgain == 2) {
                playingOn = false;
            }
            if (player.getBankroll() <= 0) {
                System.out.println("You're too broke ... you can't gamble anymore.");
                playingOn = false;
            }
        }
    }
    public static void printCards(ArrayList<Card> playerCards, ArrayList<Card> dealerCards) {
        System.out.println("These are the player's current cards:");
        for (Card temp : playerCards) {
            System.out.println(temp.getName() + " of " + temp.getSuit());
        }
        System.out.println();
        System.out.println("This is the current visible dealer card:");
        System.out.println(dealerCards.get(0).getName() + " of " + dealerCards.get(0).getSuit());
        System.out.println("+ some amount of other card(s) ;)");
    }
    public static void printBothCards(ArrayList<Card> playerCards, ArrayList<Card> dealerCards) {
        System.out.println();
        System.out.println("These are the player's current cards:");
        for (Card temp : playerCards) {
            System.out.println(temp.getName() + " of " + temp.getSuit());
        }
        System.out.println();
        System.out.println("These are the dealer's current cards:");
        for (Card temp : dealerCards) {
            System.out.println(temp.getName() + " of " + temp.getSuit());
        }
        System.out.println();
    }
    public static int calculateValue(ArrayList<Card> cards) {
        int value = 0 ;
        for (Card temp : cards) {
            if (temp.getName().equals("ace")) {
                value+=11;
            }
            else if (temp.getName().equals("2")) {
                value+=2;
            }
            else if (temp.getName().equals("3")) {
                value+=3;
            }
            else if (temp.getName().equals("4")) {
                value+=4;
            }
            else if (temp.getName().equals("5")) {
                value+=5;
            }
            else if (temp.getName().equals("6")) {
                value+=6;
            }
            else if (temp.getName().equals("7")) {
                value+=7;
            }
            else if (temp.getName().equals("8")) {
                value+=8;
            }
            else if (temp.getName().equals("9")) {
                value+=9;
            }
            else if (temp.getName().equals("10") || temp.getName().equals("jack") || temp.getName().equals("queen") || temp.getName().equals("king")) {
                value+=10;
            }
        }
        boolean ace = false;
        if (value > 21) {
            for (Card temp : cards) {
                if (temp.getName().equals("ace")) {
                    ace = true;
                }
            }
        }
        if (ace == true) {
            value -= 10;
        }
        return value;
    }
}
