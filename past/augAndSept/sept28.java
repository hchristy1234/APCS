package past.augAndSept;
//import java.util.*;
public class sept28 {
    public static void main(String[] args) {
        mult(3,4,5);
        mult(3.0, 4.0);
        
    }
    public static void mult(int a, int b) {
        System.out.println("sum of 2 integers");
        System.out.println(a+b);
    }
    public static void mult(double c, int d) {
        System.out.println("sum of 2 weird integers");
        System.out.println(c+d);
    }
    public static void mult(int a, int b, int c) {
        System.out.println("sum of 3 integers");
        System.out.println(a+b+c);
    }
    public static void mult(double a, double b) {
        System.out.println("sum of 2 doubles");
        System.out.println(a+b);
    }

}
