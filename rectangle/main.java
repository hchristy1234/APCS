public class main {
    public static void main(String[] args) {
        rectangle r = new rectangle(5, 5);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.isSquare());
        System.out.println(r.isAreaEqualToPerimeter());
    }
}
