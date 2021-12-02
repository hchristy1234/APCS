import java.util.*;
public class boba extends drink {
    private ArrayList<String> toppings;

    public boba() {
        super();
        toppings = new ArrayList<String>();
        toppings.add("lychee jelly");
    }

    public boba(String t, int i, int s, ArrayList<String> tp) {
        super(t, i, s);
        toppings = tp;
    }

    // getter
    public String getToppings(int n) {
        return toppings.get(n);
    }

    // setter
    public void setToppings(int n, String t) {
        toppings.set(n, t);
    }
}
