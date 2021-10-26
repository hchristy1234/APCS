public class oct22 {
    public static void main(String[] args) {
        // 3 things lesson

        // lesson #1
        int x = 3;
        System.out.println(x);

        shoe y = new shoe();
        System.out.println(y); // the hexadecimal of where it's stored in computer memory
        System.out.println(y.getSize());

        // lesson #2
        int[] z = {1,2,3,4,5};
        System.out.println(z[4]);
        // out of bounds:
        System.out.println(z[5]);

        // lesson #3 (array inside array) (not on next test)
        int[][] a = new int[2][3];
        // { {1, 2, 3}, {4, 5, 6}}
        int [][][][][][] b = new int[5][4][3][2][1][4];
    }
}
