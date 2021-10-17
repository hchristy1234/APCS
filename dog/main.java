public class main {
    public static void main(String[] args) {
        dog yoyo = new dog();
        dog worse = new dog("corgi", "doggo", 5.5);

        System.out.println(yoyo.getBreed());
        System.out.println(worse.getName());

        worse.setBreed("golden retriever");
        System.out.println(worse.getBreed());
    }
}
