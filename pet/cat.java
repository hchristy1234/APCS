public class cat extends pet {
    int lives;

    public cat (String n, int l) {
        super(n, "meow");
        lives = l;
    }
    public void reduceLives() {
        lives--;
    }
    public String toString() {
        return "i am " + name + "and i make the sound " + sound + "and i have " + lives + " lives";
    }
}
