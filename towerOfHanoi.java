public class towerOfHanoi {
    public static void main(String[] args) {
        tower(4, "a", "b", "c");
    }
    public static void tower(int disk, String a, String b, String c) {
        if (disk == 1) {
            System.out.println("Move disk " + disk + " from rod " + a + " to rod " + c);
        }
        else {
            tower(disk-1, a, c, b);
            System.out.println("Move disk " + disk + " from rod " + a + " to rod " + c);
            tower(disk-1, b, a, c);
        }
    }
}
