public class runner {
    private int time;
    private String gender;

    public racer(int t, String g) {
        time = t;
        gender = g;
    }

    public int getTime() {
        return time;
    }
    public String getGender() {
        return gender;
    }

    public void setTime(int t) {
        time = t;
    }
    public void setGender(String g) {
        gender = g;
    }
}
