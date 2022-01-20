public class pet {
    String name;
    String sound;
    public pet() {
        name = "none";
        sound = "no sound";
    }

    public pet(String n, String s) {
        name = n;
        sound = s;
    }

    public String getName() {
        return name;
    }
    public String getSound() {
        return sound;
    }

    public String toString() {
        return "i am " + name + "and i make the sound " + sound;
    }
}
