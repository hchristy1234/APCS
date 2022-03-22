public class multiple3 {
    public static void main(String[] args) {
        printMul3(12);
    }
    public static void printMul3(int a) {
        if (a<3) {
        }
        else {
            printMul3(a-3);
            System.out.println(a-(a%3));
        }
    }
}