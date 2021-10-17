public class oct12 {
    public static void main(String[] args) {
        shoe x = new shoe();
        shoe julie = new shoe("nike", 9, "white");
        shoe ishaan = new shoe("jordan", 11.5, "black");
        shoe sharmada = new shoe();

        System.out.println(ishaan.getBrand());
        System.out.println(julie.getSize());
        System.out.println(x.getColor());

        julie.setBrand("louboutin");
        sharmada.setBrand("nike");

        System.out.println(julie.getBrand());
    }
}
