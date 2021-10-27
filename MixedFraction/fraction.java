public class fraction {
    private int numerator;
    private int denominator;

    public fraction (int n, int d) {
        numerator = n;
        denominator = d;
    }

    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }

    public void setNum(int n) {
        numerator = n;
    }
    public void setDenom(int d) {
        denominator = d;
    }
}
