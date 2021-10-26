import java.util.*;
public class main {
    public static void main(String[] args) {
        shoes firstshoe = new shoes("nike", 6, "blue");
        shoes secondshoe = new shoes("adidas", 8, "green");
        shoes thirdshoe = new shoes("ugg", 10, "black");
        shoes[] shoeArr = {firstshoe, secondshoe, thirdshoe};

        shoeArr[1].setBrand("Toms");
        shoeArr[1].setSize(7);
        shoeArr[1].setColor("gray");

        System.out.println(shoeArr[1].getBrand());
        System.out.println(shoeArr[1].getSize());
        System.out.println(shoeArr[1].getColor());
    }
}
