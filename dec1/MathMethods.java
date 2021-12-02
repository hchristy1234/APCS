import java.util.*;
public class MathMethods {
        public static void main(String[] args) {

        }
        // only lists methods
        // sum
        public static int sum(int a, int b) {
            return a+b;
        }

        public static void sqrt(int a) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int j = 2; j <= a; j++) {
                boolean done = false;
                while (done == false) {
                    if (a%j == 0) {
                        a = a/j;
                        numbers.add(j);
                    }
                    else {
                        done = true;
                    }
                }
            }
            int firstnum = 1;
            int insidenum = 1;
            while (numbers.size() > 1) {
                if (numbers.get(0) == numbers.get(1)) {
                    firstnum = firstnum * numbers.get(0);
                    numbers.remove(0);
                    numbers.remove(0);
                }
                else {
                    insidenum *= numbers.get(0);
                    numbers.remove(0);
                }
            }
            if (numbers.size() == 1) {
                insidenum *= numbers.get(0);
            }
            if (insidenum == 1) {
                System.out.println(firstnum);
            }
            else {
                System.out.println(firstnum + "root" + insidenum);
            }
        }
}
