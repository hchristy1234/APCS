public class drink {
    private String type;
    private int ice;
    private int sweetness;
    
    public drink() {
        type = "orange juice";
        ice = 20;
        sweetness = 100;
    }

    // custom constructor
    public drink(String t, int i, int s) {
        type = t;
        ice = i;
        sweetness = s;
    }

    // getters
    public String getType() {
        return type;
    }
    public int getIce() {
        return ice;
    }
    public int getSweetness() {
        return sweetness;
    }

    // setters
    public void setType(String t) {
        type = t;
    }
    public void setIce(int i) {
        ice = i;;
    }
    public void setSweetness(int s) {
        sweetness = s;
    }
}
