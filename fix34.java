public class fix34 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 4};
        int[] finalarr = fix34(arr);
        for (int j = 0; j < finalarr.length; j++) {
            System.out.print(finalarr[j] + " ");
        }
    }
    public static int[] fix34(int[] arr) {
        int[] newarr = new int[arr.length];
        int newindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                newarr[i] = 3;
                newarr[i+1] = 4;
            }
        }
        int indcounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 3 && arr[i] != 4) {
                boolean foundspace = false;
                while (foundspace == false) {
                    if (newarr[indcounter] != 3 && newarr[indcounter] != 4) {
                        newarr[indcounter] = arr[i];
                        indcounter++;
                        foundspace = true;
                    }
                    else {
                        indcounter++;
                    }
                }
            }
        }
        return newarr;
    }
}
