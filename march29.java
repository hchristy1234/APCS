// ArithmeticException
// divide by 0;
int x = 9/0;

// NullPointerException
Shoe x = null;
System.out.prinln(x.getSize());

// ClassCastException
// casting something the wrong way
// all heels are shoes but not all shoes are heels
Heel x = new Heel();
Shoe y = (Shoe) x; // good
Shoe a = new Shoe();
Heel b = (Heel) a; // bad

// ArrayIndexOutOfBoundsException
// Everyone knows this

// IndexOutOfBoundsException
// arrayList

// IllegalArgumentException
if (x.equals("Name")) {
    throw new IllegalArgumentException("you're crazy");
} else {
    System.out.println("lol");
}