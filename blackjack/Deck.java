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

    public void shuffle() {
        ArrayList<Card> empty = new ArrayList<Card>();
        while (deck.size() > 0) {
            int z = (int)(deck.size() * Math.random());
            empty.add(deck.get(z));
            deck.remove(z);
        }
        for (int i = 0; i < empty.size(); i++) {
            deck.add(empty.get(i));
        }
    }
}
