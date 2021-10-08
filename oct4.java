public class oct4 {
    public static void main(String[] args) {
        int i = 3;
        System.out.println(++i);
        System.out.println(i);

        int x = 3;
        System.out.println(x++ + ++x);
        // first part 3, second part 5

        int y = 3;
        System.out.println(y++ + ++y * y++);
        // 3 + 5 * 5
    }
}

// preincrement ++x
// postincrement x++
