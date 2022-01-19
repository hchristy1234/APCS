public class jan19 {
    public static void main(String[] args) {
        Shoe[] shelf = new Shoe[4];

        Shoe x = new Shoe();
        Shoe y = new Shoe(13, "blue");
        Heel a = new Heel();
        Heel b = new Heel(6, "purple", 5);

        // converts the Heels into a Shoe that is a Heel
        shelf[0] = x;
        shelf[1] = y;
        shelf[2] = a;
        shelf[3] = b;

        System.out.println(a.getHeight()); // this works
        System.out.println(shelf[2].getHeight()); // this doesn't work
    }
}
