import java.util.*;
public class sorts {
   public static void main(String[] args) {
       int[] unsortedArr = {10, 3, 23, 4, 29};
       int[] newarr = insertionSort(unsortedArr);
       for (int i = 0; i < newarr.length; i++) {
           System.out.println(newarr[i]);
       }
   } 

   public static int[] smartBubbleSort(int[] a) {
       boolean sorted = false;
       while (!sorted) {
           int counter = 0;
           for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                    counter++;
                }
           }
           if (counter == 0) {
               sorted = true;
           }
       }
       return a;
   }
   public static int[] insertionSort(int[] a) {
        //insert into front. move | forward.
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> sortedArr = new ArrayList<Integer>();
        int[] newarr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            x.add(a[i]);
        }
        sortedArr.add(x.get(0));
        x.remove(0);
        while (x.size() > 0) {
            int current = x.get(0);
            boolean inserted = false;
            int indexCounter = 0;
            while (!inserted) {
                if (sortedArr.get(indexCounter) > current) {
                    sortedArr.add(indexCounter, current);
                    x.remove(0);
                    inserted = true;
                }
                else if (indexCounter == sortedArr.size()-1) {
                    sortedArr.add(current);
                    x.remove(0);
                    inserted = true;
                }
                else {
                    indexCounter++;
                }
            }
        }
        for (int i = 0; i < sortedArr.size(); i++) {
            newarr[i] = sortedArr.get(i);
        }
        return newarr;
   }
   public static int[] selectionSort(int[] a) {
       // select smallest number. insert to left.
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> sortedArr = new ArrayList<Integer>();
        int[] newarr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            x.add(a[i]);
        }
        while (sortedArr.size() < a.length) {
            int minIndex = 0;
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) < x.get(minIndex)) {
                    minIndex = i;
                }
            }
            sortedArr.add(x.get(minIndex));
            x.remove(minIndex);
        }
        for (int i = 0; i < sortedArr.size(); i++) {
            newarr[i] = sortedArr.get(i);
        }
        return newarr;
   }

}
