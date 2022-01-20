public class dog extends pet {
    String breed;

    public dog (String n, String b) {
        super(n, "ruff");
        breed = b;
    }
    public String getBreed() {
        return breed;
    }
    public String toString() {
        return "i am " + name + "and i make the sound " + sound + "and i am " + breed;
    }
}
