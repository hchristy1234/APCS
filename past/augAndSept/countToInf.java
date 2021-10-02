public class countToInf {
    public static void main(String[] args) {
        count(1);
    }
    public static void count(int a) {
        System.out.println(a);
        a++;
        count(a);
    }
}
