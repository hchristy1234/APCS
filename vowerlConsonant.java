public class vowerlConsonant {
    public static void main(String[] args) {
        vc("dhruv");
    }
    public static void vc(String word) {
        if (word.length() == 0) {
            System.out.print("");
        }
        else {
            String s = word.substring(0, 1);
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                System.out.print("v");
            }
            else {
                System.out.print("c");
            }
            vc(word.substring(1, word.length()));
        }
    }
}
