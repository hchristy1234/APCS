import java.util.*;

public class helloname {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("what is your name?");
    String name = scan.nextLine();
    sayHello(name);
  }
  public static void sayHello(String name) {
    System.out.println("hello " + name);
  }
}
