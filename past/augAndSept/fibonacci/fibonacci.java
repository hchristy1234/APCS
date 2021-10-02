public class fibonacci {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int first = 0;
    int second = 1;
    int num = 0;
    System.out.print(first + " ");
    System.out.print(second + " ");
    while (true) {
      num = first + second;
      System.out.print(num + " ");
      first = second;
      second = num;
    }
  }
}
