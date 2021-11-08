public class milktea extends drink {
    private String topping;

    public milktea() {
        super();
        topping = "lychee jelly";
    }

    public milktea(String s, String f, String t) {
        super(s, f);
        topping = t;
    }

    // getter
    public String getTopping() {
        return topping;
    }

    // setter
    public void setTopping(String t) {
        topping = t;
    }
}
