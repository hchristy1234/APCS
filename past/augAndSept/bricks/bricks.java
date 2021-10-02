import java.util.*;

public class bricks {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of small bricks");
        int small = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the number of big bricks");
        int big = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the goal");
        int goal = scan.nextInt();
        scan.nextLine();
        System.out.println(calc(small, big, goal));
        System.out.println("worst candy is almond joy");
        System.out.println("favorite dessert is ice cream");
    }

    public static boolean calc(int small, int big, int goal) {
        int num = goal;
        boolean done = false;
        while (num >= 5 && big > 0) {
            num -= 5;
            big--;
        }
        while (num > 0 && small > 0) {
            num -= 1;
            small--;
        }
        if (num == 0) {
            done = true;
        }
        return done;
    }
}
