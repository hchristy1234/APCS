public class oct11 {
    public static void main(String[] args) {
        String a = 3+4+"hi"+3+4;
        System.out.println(a);
        // 7hi34
        // performs arithmetic operations in beginning and then goes string mode

        String b = 3+4*2+"hi"+3+4;
        System.out.println(b);
        // 11hi34

        String c = 3+4+"hi"+(3+4);
        System.out.println(c);
        // 7hi7 beause of the parenthesis
    }
}
