public class Player {
    private String name;
    private int bankroll;

    public Player(String n, int b) {
        name = n;
        bankroll = b;
    }

    public String getName() {
        return name;
    }
    public int getBankroll() {
        return bankroll;
    }

    public void setName(String n) {
        name = n;
    }
    public void setBankroll(int b) {
        bankroll = b;
    }
}
