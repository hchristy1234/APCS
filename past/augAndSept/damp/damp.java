import java.util.*;
public class damp {
  public static void main (String[] args) {
    int x = 5;
    x++; // adds 1
    x--; // subtracts 1;
    x+=9; // x = x + 9
    x-=9; // x = x - 9
    x*=9; // x = x * 9
    x/=9; // x = x / 9
    x%=9; // x = x % 9

    int a = 9; int b = 10;

    if( a == b ) {
      System.out.println("yay");
    }

    String c = "Carol";
    String d = "Caroline";

    if (c.equals(d)) {
      System.out.println("greateness");
    }

    if ( c.equals("Carol") || d.equals("Michaela")) {
      System.out.println("Samey Samey");
    }
  }
}
