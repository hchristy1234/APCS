public class sept17 {
  public static void main (String[] args) {
    stuff();
    stuff();
    int a = 21;
    int b = 7;
    int z = div(b, a);
    System.out.println(z);
  }

  // will not take in anything. will not give anmything back.
  public static void stuff() {
    System.out.println("hi");
  }

  //will take in 2 numbers. will not return anmything
  public static void subt(int a, int b) {
    System.out.println(a-b);
  }

  //will take in 2 numbers. will RETURN a number
  public static int div(int a, int b) {
    int c = a/b;
    return c;
  }
}
