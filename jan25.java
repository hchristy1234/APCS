public class jan25 {
    public static void main(String[] args) {
        // 1. interface class: instructional class on what child class must include
        // 2. interface method: resides in abstract class ONLY, only off of interface class

        // footwear is instructional class for shoe

        // this would usually go in a separate file. doing it here bc lazy
        public interface Footwear {
            // instructional methods that u want shoe to have to create
            public void stuff();
            public double addToSize(int n);
        }

        // now pretend we are in shoe file
        public class Shoe implements Footwear {
            // setters getters consturctors blah blah

            // now that we implement the 2 methods, we are happy.
            public void stuff() {
                System.out.println("Hello Patty");
            }
            public double addToSize(int a) {
                return size + a;
            }
        }

        // interface method example. means HEEL has to create me
        public abstract class Shoe implements Footwear {
            public abstract void stuffstuff();
            // now heel must have stuffstuff() to compile properly
        }
        public class Heel extends Shoe {
            // random constructors getters setters etc etc
            public void stuffstuff() {
                System.out.println("should be interface... java is stupid :D");
            }
        }
    }
}
