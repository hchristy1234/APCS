import javax.lang.model.util.ElementScanner6;

public class feb23 {
    public static void main(String[] args) {
        // 5! = 5*4*3*2*1 = 120
        System.out.println(fact(3));
    }

    public static int fact(int a) {
        // base case (end of loop case)
        if (a==1) {
            return 1;
        }

        // recursive case (loop)
        else {
            return a * fact(a-1);
        }

        // return (3 * (2 * (1)))
    }

    // draw stars
    stars(3)
    ***
    **
    *

    // sum of digits: 1723 -> 13
    // sum (a,b) adding 1 each time // 1 2 3 4 5 9
    // product (a,b) use sum (recursively still)
    // power(a,b) use product
}
