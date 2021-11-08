public class main {
    public static void main(String[] args) {
        milktea x = new milktea("large", "mango", "lychee jelly");
        System.out.println(x.getSize());
        System.out.println(x.getFlavor());
        System.out.println(x.getTopping());
        x.setSize("small");
        x.setFlavor("watermelon");
        x.setTopping("grass jelly");
        System.out.println(x);
    }
}
