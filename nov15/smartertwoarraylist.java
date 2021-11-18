import java.util.*;
public class smartertwoarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        x.add(new ArrayList<Integer>());
        x.add(new ArrayList<Integer>());
        x.add(new ArrayList<Integer>());
        for (int j = 1; j <= 3; j++) {
            x.get(0).add(j);
        }
        for (int j = 4; j <= 6; j++) {
            x.get(1).add(j);
        }
        for (int j = 7; j <= 9; j++) {
            x.get(2).add(j);
        }
        System.out.println(x);
        System.out.println(x.get(0).get(0));
        System.out.println(x.get(1).get(1));
        System.out.println(x.get(2).get(0));
    }
}
