public class nov29 {
    public static void main(String[] args) {
        // final and static
        final int x;
        x = 3;
        // cant reassign value to x = 4;
        
        // static: when you do not require the usage of an instance variable(attribute)
        // when using objects, use nonstatic
        // when not using objects, use static
        // nonstatic u need to create an instance of it to utilize
        // static u can just utilize
        // static methods cannot utilize instance variables
    }

    public static void hi() {
        System.out.println("hi person");
    }
}
