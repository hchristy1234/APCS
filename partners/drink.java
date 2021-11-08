public class drink {
    private String size;
    private String flavor;

    public drink() {
        size = "large";
        flavor = "strawberry";
    }

    // custom constructor
    public drink(String s, String f) {
        size = s;
        flavor = f;
    }

    // getters

    public String getSize() {
        return size;
    }
    public String getFlavor() {
        return flavor;
    }

    // setters
    public void setSize(String s) {
        size = s;
    }
    public void setFlavor(String f) {
        flavor = f;
    }

    // toString method
    public String toString() {
        return "I am size " + size + ". I am the flavor " + flavor + ".";
    }
}
