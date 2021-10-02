
public class sept30class {
    public static void main(String[] args) {
        // lesson 1
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        stuff(x);
        System.out.println(x[2]);
        // lesson 2
        //System.out.println(x.length);
        // int x = 5;
        // stuff(x);
        // System.out.println(x);
    }
    public static void stuff(int[] a) {
        a[2]++;
        System.out.println(a[2]);
    }
    // array points to the memory bucket so it gives access to it
    // in single variables it just makes a copy so if u change in the method it doesnt actually change
}
