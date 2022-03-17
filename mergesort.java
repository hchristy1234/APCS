import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        int[] x = {3, 39, 1, 34, 19, 33, 3};
        mergeSort(x, 0, x.length-1);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
    public static void mergeSort(int[] a, int x, int y) {
        if (y-x>=1) {
            int mid = x + (y-x)/2;
            mergeSort(a, x, mid);
            mergeSort(a, mid+1, y);
            mergeArrays(a, x, y);
        }
    }
    public static void mergeArrays(int[] a, int x, int y) {
        int mid = x + (y-x)/2;
        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = x; i <= mid; i++) {
            p1.add(a[i]);
        }
        for (int i = mid+1; i <= y; i++) {
            p2.add(a[i]);
        }
        System.out.println("x: " + x);
        System.out.println("mid: " + mid);
        System.out.println("y: " + y);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        while (p1.size() != 0 && p2.size() != 0) {
            if (p1.get(0) < p2.get(0)) {
                temp.add(p1.get(0));
                p1.remove(0);
            }
            else {
                temp.add(p2.get(0));
                p2.remove(0);
            }
        }
        System.out.println("intermediate p1: " + p1);
        System.out.println("intermediate p2: " + p2);
        while (p1.size() > 0) {
            temp.add(p1.get(0));
            p1.remove(0);
        }
        while (p2.size() > 0) {
            temp.add(p2.get(0));
            p2.remove(0);
        }
        System.out.println("temp: " + temp);
        int arrAt = x;
        while(temp.size()>0) {
            a[arrAt] = temp.get(0);
            temp.remove(0);
            arrAt++;
        }
    }
}
