import java.util.*;
public class arraylisteven {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i = 2; i <= 20; i+= 2) {
            x.add(i);
        }
        for (int j : x) {
            System.out.println(j);
        }
    }
}
