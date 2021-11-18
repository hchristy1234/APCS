public class multiplicationtable {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                table[i-1][j-1] = i*j;
                System.out.print(table[i-1][j-1] + " ");
            }
            System.out.println();
        }
    }
}
