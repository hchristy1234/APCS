import java.util.*;
public class twoarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> newarr1 = new ArrayList<Integer>();
        ArrayList<Integer> newarr2 = new ArrayList<Integer>();
        ArrayList<Integer> newarr3 = new ArrayList<Integer>();
        for (int j = 1; j <= 3; j++) {
            newarr1.add(j);
        }
        x.add(newarr1);
        for (int j = 4; j <= 6; j++) {
            newarr2.add(j);
        }
        x.add(newarr2);
        for (int j = 7; j <= 9; j++) {
            newarr3.add(j);
        }
        x.add(newarr3);
        System.out.println(x);
        System.out.println(x.get(0).get(0));
        System.out.println(x.get(1).get(1));
        System.out.println(x.get(2).get(0));
    }
}
