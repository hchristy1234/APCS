public class jan31 {
    // downcasting: when you make the shoe a heel
    // when you utilize interface, the next REAL child has to have access to the method
    // abstract class isn't REAL. so second doesn't necessarily need yelena();

    // downcasting. cannot use getHeight() and setHeight()
    Shoe x = new Heel(); // making a parent with child attributes

    // upcasting
    // System.out.println(x.getHeight()) doesn't work
    System.out.println( ((Heel)x).getHeight()); // upcasts back to heel

    Heel y = (Heel)x; // creating another varibale and upcasting back to Heel
    System.out.println(y.getHeight()); // now works

    // real life example
    Heel a = new Heel(8, "blue", 2);
    Shoe b = new Shoe(12, "green");
    
    Shoe[] shelf = new Shoe[2];
    shelf[0] = a;
    shelf[1] = b;
    // System.out.println(shelf[0].getHeight()) // doesn't work
    System.out.println(((Heel)shelf[0]).getHeight()); // this works now!
    System.out.println(a.getHeight()); // still works bc array just has copy of the shoe

    // if you want to upcast, upcasting only works with something that has already been downcasted
}
