public class dog {
    private String breed;
    private String name;
    private double age;

    public dog() {
        breed = "lab";
        name = "yoyo";
        age = 0.8;
    }

    public dog(String b, String n, double a) {
        breed = b;
        name = n;
        age = a;
    }

    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public double getAge() {
        return age;
    }

    public void setBreed(String b) {
        breed = b;
    }
    public void setName(String n) {
        name = n;
    }
    public void setAge(double a) {
        age = a;
    }
}
