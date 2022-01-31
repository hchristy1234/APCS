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
        theDeck.shuffle();
        // for (int i = 0; i < theDeck.getDeck().size(); i++) {
        //     System.out.println(theDeck.getDeck().get(i).getName() + " " + theDeck.getDeck().get(i).getSuit());
        // }

        System.out.println("WELCOME TO BLACKJACK!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        Player player = new Player(name, 500);
        Player dealer = new Player("dealer", 500);
        ArrayList<Card> playerCards = new ArrayList<Card>();
        ArrayList<Card> dealerCards = new ArrayList<Card>();
    }
}
