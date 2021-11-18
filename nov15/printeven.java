public class printeven {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i= 1; i <= 10; i++) {
            x[i-1] = i*2;
        }
        for (int z : x) {
            System.out.println(z);
        }
    }
}
