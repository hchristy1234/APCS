public class feb15 {
    public static void main(String[] args) {
        // polymorphism
        Shoes x = new Heels(7, "white", 3); // downcasting
        // can use methods in Shoes; can use overwritten ones in Heels

        // upcast
        ((Heel)x).setHeight(); // only for this instance.
        // useful for arrays and arraylists.
        Heel Ishan();
        Heel Ishaan();
        Shoes[] box;// put it in. box[0] will be a shoe that's a heel.


        // when you make Shoes abstract, you can no longer create a shoe. shoe x=new shoes()
        // you can still do Shoe x = new Heels();
        // you can still doe shoe[] y = new shoe[];
        // but you just can't make an actual shoe.

        interface footwear {
            // only have method names
            public int methodB();
        }
        Shoes implements footwear {
            // methodB needs to be accessible from here.
            // if you make Shoes abstract, then heels can make the methodB();
        }


        // interface methods
        // just like interface classes. can only be instantiated in abstract class.
        public abstract shoes {
            public abstract int methodD(); // now heel must create a methodB (next real class)
        }

        // selection, insertion, smart bubble, binary search
        // 2 questions on the test
    }
}