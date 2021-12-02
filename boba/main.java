import java.util.*;
public class main {
    public static void main(String[] args) {
        ArrayList<String> toppings1 = new ArrayList<String>();
        toppings1.add("lychee jelly");
        toppings1.add("grass jelly");
        ArrayList<String> toppings2 = new ArrayList<String>();
        toppings2.add("lychee jelly");
        toppings2.add("grass jelly");
        ArrayList<String> toppings3 = new ArrayList<String>();
        toppings3.add("lychee jelly");
        toppings3.add("grass jelly");
        drink[] drinks = new drink[3];
        boba[] bobas = new boba[3];
        for (int i = 0; i < 3; i++) {
            drinks[i] = new drink();
        }
        bobas[0] = new boba("mango milk tea", 20, 100, toppings1);
        bobas[1] = new boba("mango milk tea", 20, 100, toppings2);
        bobas[2] = new boba("mango milk tea", 20, 100, toppings3);

        bobas[1].setType("jasmine milk tea");
        bobas[1].setSweetness(30);
        bobas[1].setIce(50);
        bobas[1].setToppings(0, "pudding");
        bobas[1].setToppings(1, "boba");
    }
}