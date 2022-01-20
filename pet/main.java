public class main {
    public static void main(String[] args) {
        pet[] petarray = new pet[2];
        dog a = new dog("Romeo", "Samoyed");
        cat b = new cat("Juliet", 4);
        petarray[0] = a;
        petarray[1] = b;

        // toString works (runs the ones in the individual dog and cat files)
        System.out.println(petarray[0]);
        System.out.println(petarray[1]);

        // getters work because they're in the main pet file
        System.out.println(petarray[0].getName());
        System.out.println(petarray[0].getSound());
        System.out.println(petarray[1].getName());
        System.out.println(petarray[1].getSound());

        // petarray[0].getBreed(); doesn't work because it's only in the dog file
        // petarray[1].reduceLives(); doesn't work bc it's only in the cat file
    }
}
