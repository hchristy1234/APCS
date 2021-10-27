public class main {
    public static void main(String[] args) {
        MixedFraction firstfrac = new MixedFraction(5, 1, 7);
        firstfrac.getFraction().setDenom(9);

        fraction improperFrac = firstfrac.getImproper();

        firstfrac.sayHi("Julie");
    }
}
