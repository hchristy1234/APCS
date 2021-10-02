public class conditionals {
  public static void main (String[] args) {
    // int i = 1;
    // while (i<=5) { // condition
    //   System.out.println("girls volleyball is mad at Coach Donny");
    //   i = i+1;
    // }
    int x = 80;
    if (x>=90) {
      System.out.println("You got an A! You're allowed to eat dinner");
    }
    else if (x>=80) {
      System.out.println("You got a B! You are grounded for 3 years!");
    }
    else if (x>=70) {
      System.out.println("You got a C! Trade in cell phone for pager!");
    }
    else if (x>=60) {
      System.out.println("You got a C! Who are you?");
    }
    else {
      System.out.println("You got an F. You are now invisible.");
    }
  }
}
