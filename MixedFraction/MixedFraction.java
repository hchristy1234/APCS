public class MixedFraction {
    private int wNum;
    private fraction frac;

    public MixedFraction() {
        wNum = 4;
        frac = new fraction(3, 4);
    }
    public MixedFraction(int w, int n, int d) {
        wNum = w;
        frac = new fraction(n, d);
    }
    public MixedFraction(int w, fraction f) {
        wNum = w;
        frac = f;
    }

    // getters
    public int getWhole() {
        return wNum;
    }
    public fraction getFraction() {
        return frac;
    }

    // setters
    public void setWhole(int w) {
        wNum = w;
    }
    public void setFraction(fraction c) {
        frac = c;
    }

    // custom methods
    public fraction getImproper() {
        int num = wNum * frac.getDenom() + frac.getNum();
        int denom = frac.getDenom();
        fraction newfrac = new fraction(num, denom);
        return newfrac;
    }

    public void sayHi(String name) {
        System.out.println("Hi " + name);
    }
}