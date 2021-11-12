import java.util.*;
public class nov12 {
    public static void main(String[] args) {
        // two diff types of objects: primitive and object
        // primitive - int, boolean, double, char
        // object - String, Shoes, Scanner, Arrays, Integer, Double

        // in array: you can't change the length after you create it

        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(30);
        x.add(11);
        x.add(35);
        System.out.println(x.get(1));
        System.out.println(x);
        System.out.println(x.size());

        x.set(2, 22); // 30, 11, 22
        x.remove(1); // 30, 22
        x.add(1, 3); // 30, 3, 22
        System.out.println(x);
    }
}
