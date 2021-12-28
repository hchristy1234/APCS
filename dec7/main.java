public class main {
    public static void main(String[] args) {
        Shoes Christy = new Shoes("adidas", 6.5, "white");
        Shoes x = new Shoes();
        x.copyCat(Christy);
        System.out.println(x);
    }
}