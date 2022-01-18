public class jan18 {
    public static void main(String[] args) {
        // polymorphismmmmm
        // Shoes can access: size, color, getsize, getcolor, setsize, setcolor, printB
        // Shoes cannot access: printA, toString
        // Heel can access: printA, toString
        // Heel cannot access: height,getHeight, setHeight, toString
        // why is this weird ?!?!?!
        // this is legal !!!
        // you can access everything in Shoe unless it's overwritten in Heel. in which case it uses the one in heel
        Shoes x = new Heels(7, "white", 2);

        // illegal !!! bad !
        Heels y = new Shoes();
        
    }
}
