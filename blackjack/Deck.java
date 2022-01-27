import java.util.*;
public class Deck {
    private ArrayList<Card> deck;

    public Deck(ArrayList<Card> d) {
        deck = d;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
    public void setDeck(ArrayList<Card> d) {
        deck = d;
    }

    public ArrayList<Card> shuffle(ArrayList<Card> d) {
        int z = int(42 * Math.random()); 
    }
}
