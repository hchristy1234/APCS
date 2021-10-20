public class main {
    public static void main(String[] args) {
        shoe defaultshoe = new shoe();
        sock x = new sock(7, "blue");
        shoe coolshoe = new shoe("nike", 6.5, "neon pink", x);
        coolshoe.getSockies().setColor("neon green");
        System.out.println(coolshoe.getSockies().getColor());
    }
}