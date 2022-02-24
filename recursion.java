public class recursion {
    public static void main(String[] args) {
        drawStars(3);
        System.out.println(sumDigits(1723));
        System.out.println(sum(3, 4));
        System.out.println(product(22, 2));
        System.out.println(power(2, 4));
    }

    public static void drawStars(int a) {
        if (a == 1) {
            System.out.print("*");
        }
        else {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
            drawStars(a-1);
        }
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n%10 + sumDigits(n/10);
        }
    }

    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return 1 + sum(a, b-1);
        }
    }

    public static int product(int a, int b) {
        if (b==0) {
            return 0;
        }
        else {
            return sum(a, product(a, b-1));
        }
    }

    public static int power(int a, int b) {
        if (b==0) {
            return 1;
        }
        else {
            return product(a, power(a, b-1));
        }
    }
}
