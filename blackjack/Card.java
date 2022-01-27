public class Card {
    private String name;
    private String suit;

    public Card(String n, String s) {
        name = n;
        suit = s;
    }
    public String getName() {
        return name;
    }
    public String getSuit() {
        return suit;
    }
    public void setName(String n) {
        name = n;
    }
    public void setSuit(String s) {
        suit = s;
    }
}
