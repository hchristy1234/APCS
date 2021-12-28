import java.util.*;
public class modifyarrL {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(30);
        arr.add(11);
        arr.add(9);
        arr.add(23);
        arr.add(0);
        System.out.println(arr);
        arr.set(2, 35);
        System.out.println(arr);
        arr.remove(1);
        arr.remove(1);
        System.out.println(arr);
        arr.add(1, 3);
        arr.add(2, 22);
        arr.set(4, 5);
        System.out.println(arr);
    }
}
