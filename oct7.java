import java.util.*;
public class oct7 {
    public static void main(String[] args) {
        String a = "missionsanjose";
        String b = "ironmanmarriesblackwidow";

        // length
        System.out.println(a.length()); // int

        // substring (strings)
        System.out.println(a.substring(7)); // gets rid of first 7 chars; "sanjose"
        System.out.println(a.substring(7,10));
        System.out.println(b.substring(7, 14));

        //indexOf
        System.out.println(a.indexOf("n"));
        //always returns first find
        //can't find...return -1
        //when finding a long string, will return spot of first letter

        //.equals
        System.out.println(a.equals(b)); // boolean

        //compareTo
        String c = "abash";
        String d = "business"; 
        //when comparing strings it goes to the first letter that's different

        System.out.println( c.compareTo(d)); 
        System.out.println( d.compareTo(c));
    }
}
