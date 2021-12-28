import java.util.*;
public class dec2 {
    public static void main(String[] args) {
        int[][] n =  {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] newn = reverseMatrix(n);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(newn[i][j]);
            }
            System.out.println();
        }
    }
public static ArrayList<String> ArrayToAList(String[] a) {
    ArrayList<String> coolerthanyou = new ArrayList<String>();
    for (String temp : a) {
        coolerthanyou.add(temp);
    }
    return coolerthanyou;
}

public static String[] AListToArray(ArrayList<String> a) {
    String[] anothercoolerthanyouarray = new String[a.size()];
    int counter = 0;
    for (String object : a) {
        anothercoolerthanyouarray[counter] = object;
        counter++;
    }
    return anothercoolerthanyouarray;
}

public static int[] reverseArray(int[] arr){
    int[] reverse = new int[arr.length];

    int index = arr.length - 1;
    for (int x : arr){
        reverse[index] = x;
        index--;
    }

    return reverse;
}

public static int[][] reverseAllRow(int[][] arr){
    int[][] reverse = new int[arr.length][arr[0].length];
    int counter = 0;
    for (int[] x : arr){
        int index = x.length - 1;
        for (int z : x){
            reverse[counter][index] = z;
            index--;
        }
        counter++;
    }
    return reverse;
}

public static int[][] reverseMatrix(int[][] arr){
    int[][] reverse = new int[arr.length][arr[0].length];
    int counter = arr.length-1;
    for (int[] x : arr){
        int index = x.length - 1;
        for (int z : x){
            reverse[counter][index] = z;
            index--;
        }
        counter--;
    }
    return reverse;
}
}