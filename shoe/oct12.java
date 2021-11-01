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

        Heels x = new Heels();
        System.out.println(x.getSize());
        System.out.println(x.getColor());
        System.out.println(x.getHeight());
        x.setColor("black");
        System.out.println(x.getColor());

        Heels y = new Heels(12, "blue", 2);
        
        Shoes x= new Shoes(7, "yellow");
        System.out.println(x); // originally prints out random memory thing
        // after adding toString, it prints the return thing of toString
    }
}
