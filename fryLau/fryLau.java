import java.util.*;

public class fryLau {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an int: ");
        int b = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an int: ");
        int c = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an int: ");
        int d = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an int: ");
        int e = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an int: ");
        int f = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an int: ");
        int g = scan.nextInt();
        scan.nextLine();
        mean(a, b, c, d, e, f, g);
        median(a, b, c, d, e, f, g);
        mode(a, b, c, d, e, f, g);
    }
    public static void mean(int a, int b, int c, int d, int e, int f, int g) {
        double mean = (double)(a + b + c + d + e + f + g) / 7.0;
        System.out.println("here is the mean: " + mean);
    }
    public static void median(int a, int b, int c, int d, int e, int f, int g) {
         int trynum = a;
         int median = 0;
         int larger = 0;
         int smaller = 0;
         int same = 0;
         if (b > trynum) {
            larger++;
         } else if (b < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (c > trynum) {
            larger++;
         } else if (c < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (d > trynum) {
            larger++;
         } else if (d < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (e > trynum) {
            larger++;
         } else if (e < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (f > trynum) {
            larger++;
         } else if (f < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (g > trynum) {
            larger++;
         } else if (g < trynum) {
             smaller++;
         } else {
             same++;
         }
         if ((larger + same) >= 3 && (smaller + same) >= 3) {
             median = trynum;
         }

         trynum = b;
         larger = 0;
         smaller = 0;
         same = 0;
         if (a > trynum) {
            larger++;
         } else if (a < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (c > trynum) {
            larger++;
         } else if (c < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (d > trynum) {
            larger++;
         } else if (d < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (e > trynum) {
            larger++;
         } else if (e < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (f > trynum) {
            larger++;
         } else if (f < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (g > trynum) {
            larger++;
         } else if (g < trynum) {
             smaller++;
         } else {
             same++;
         }
         if ((larger + same) >= 3 && (smaller + same) >= 3) {
             median = trynum;
         }

         trynum = c;
         larger = 0;
         smaller = 0;
         same = 0;
         if (a > trynum) {
            larger++;
         } else if (a < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (b > trynum) {
            larger++;
         } else if (b < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (d > trynum) {
            larger++;
         } else if (d < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (e > trynum) {
            larger++;
         } else if (e < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (f > trynum) {
            larger++;
         } else if (f < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (g > trynum) {
            larger++;
         } else if (g < trynum) {
             smaller++;
         } else {
             same++;
         }
         if ((larger + same) >= 3 && (smaller + same) >= 3) {
             median = trynum;
         }

         trynum = d;
         larger = 0;
         smaller = 0;
         same = 0;
         if (a > trynum) {
            larger++;
         } else if (a < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (b > trynum) {
            larger++;
         } else if (b < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (c > trynum) {
            larger++;
         } else if (c < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (e > trynum) {
            larger++;
         } else if (e < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (f > trynum) {
            larger++;
         } else if (f < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (g > trynum) {
            larger++;
         } else if (g < trynum) {
             smaller++;
         } else {
             same++;
         }
         if ((larger + same) >= 3 && (smaller + same) >= 3) {
             median = trynum;
         }

         trynum = e;
         larger = 0;
         smaller = 0;
         same = 0;
         if (a > trynum) {
            larger++;
         } else if (a < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (b > trynum) {
            larger++;
         } else if (b < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (c > trynum) {
            larger++;
         } else if (c < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (d > trynum) {
            larger++;
         } else if (d < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (f > trynum) {
            larger++;
         } else if (f < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (g > trynum) {
            larger++;
         } else if (g < trynum) {
             smaller++;
         } else {
             same++;
         }
         if ((larger + same) >= 3 && (smaller + same) >= 3) {
             median = trynum;
         }

         trynum = f;
         larger = 0;
         smaller = 0;
         same = 0;
         if (a > trynum) {
            larger++;
         } else if (a < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (b > trynum) {
            larger++;
         } else if (b < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (c > trynum) {
            larger++;
         } else if (c < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (d > trynum) {
            larger++;
         } else if (d < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (e > trynum) {
            larger++;
         } else if (e < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (g > trynum) {
            larger++;
         } else if (g < trynum) {
             smaller++;
         } else {
             same++;
         }
         if ((larger + same) >= 3 && (smaller + same) >= 3) {
             median = trynum;
         }

         trynum = g;
         larger = 0;
         smaller = 0;
         same = 0;
         if (a > trynum) {
            larger++;
         } else if (a < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (b > trynum) {
            larger++;
         } else if (b < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (c > trynum) {
            larger++;
         } else if (c < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (d > trynum) {
            larger++;
         } else if (d < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (e > trynum) {
            larger++;
         } else if (e < trynum) {
             smaller++;
         } else {
             same++;
         }
         if (f > trynum) {
            larger++;
         } else if (f < trynum) {
             smaller++;
         } else {
             same++;
         }
         if ((larger + same) >= 3 && (smaller + same) >= 3) {
             median = trynum;
         }
         System.out.println("here is the median: " + median);
    }

    public static void mode(int a, int b, int c, int d, int e, int f, int g) {
        int trynum = a;
        int countera = 0;
        if (b==trynum) {
            countera++;
        }
        if (c==trynum) {
            countera++;
        }
        if (d==trynum) {
            countera++;
        }
        if (e==trynum) {
            countera++;
        }
        if (f==trynum) {
            countera++;
        }
        if (g==trynum) {
            countera++;
        }

        trynum = b;
        int counterb = 0;
        if (a==trynum) {
            counterb++;
        }
        if (c==trynum) {
            counterb++;
        }
        if (d==trynum) {
            counterb++;
        }
        if (e==trynum) {
            counterb++;
        }
        if (f==trynum) {
            counterb++;
        }
        if (g==trynum) {
            counterb++;
        }

        trynum = c;
        int counterc = 0;
        if (a==trynum) {
            counterc++;
        }
        if (b==trynum) {
            counterc++;
        }
        if (d==trynum) {
            counterc++;
        }
        if (e==trynum) {
            counterc++;
        }
        if (f==trynum) {
            counterc++;
        }
        if (g==trynum) {
            counterc++;
        }

        trynum = d;
        int counterd = 0;
        if (a==trynum) {
            counterd++;
        }
        if (b==trynum) {
            counterd++;
        }
        if (c==trynum) {
            counterd++;
        }
        if (e==trynum) {
            counterd++;
        }
        if (f==trynum) {
            counterd++;
        }
        if (g==trynum) {
            counterd++;
        }

        trynum = e;
        int countere = 0;
        if (a==trynum) {
            countere++;
        }
        if (b==trynum) {
            countere++;
        }
        if (c==trynum) {
            countere++;
        }
        if (d==trynum) {
            countere++;
        }
        if (f==trynum) {
            countere++;
        }
        if (g==trynum) {
            countere++;
        }

        trynum = f;
        int counterf = 0;
        if (a==trynum) {
            counterf++;
        }
        if (b==trynum) {
            counterf++;
        }
        if (c==trynum) {
            counterf++;
        }
        if (d==trynum) {
            counterf++;
        }
        if (e==trynum) {
            counterf++;
        }
        if (g==trynum) {
            counterf++;
        }

        trynum = g;
        int counterg = 0;
        if (a==trynum) {
            counterg++;
        }
        if (b==trynum) {
            counterg++;
        }
        if (c==trynum) {
            counterg++;
        }
        if (d==trynum) {
            counterg++;
        }
        if (e==trynum) {
            counterg++;
        }
        if (f==trynum) {
            counterg++;
        }

        if (countera == counterb && counterb == counterc && counterc == counterd && counterd == countere && countere == counterf && counterf == counterg) {
            System.out.println("There is no mode.");
        }
        else {
            System.out.println("here are the mode(s): ");
            if (countera >= counterb && countera >= counterc && countera >= counterd && countera >= countere && countera >= counterf && countera >= counterg) {
                System.out.println(a);
            }
            if (counterb >= countera && counterb >= counterc && counterb >= counterd && counterb >= countere && counterb >= counterf && counterb >= counterg && b != a) {
                System.out.println(b);
            }
            if (counterc >= countera && counterc >= counterb && counterc >= counterd && counterc >= countere && counterc >= counterf && counterc >= counterg && c !=a && c != b) {
                System.out.println(c);
            }
            if (counterd >= countera && counterd >= counterb && counterd >= counterc && counterd >= countere && counterd >= counterf && counterd >= counterg && d !=a && d != b && d != c) {
                System.out.println(d);
            }
            if (countere >= countera && countere >= counterb && countere >= counterc && countere >= counterd && countere >= counterf && countere >= counterg && e !=a && e != b && e != c && e != d) {
                System.out.println(e);
            }
            if (counterf >= countera && counterf >= counterb && counterf >= counterc && counterf >= counterd && counterf >= countere && counterf >= counterg && f !=a && f != b && f != c && f != d && f != e) {
                System.out.println(f);
            }
            if (counterg >= countera && counterg >= counterb && counterg >= counterc && counterg >= counterd && counterg >= countere && counterg >= counterf && g !=a && g != b && g != c && g != d && g != e && g != f) {
                System.out.println(g);
            }
        }
    }
}