public class school {
    private classroom[] classes;
    private String principal;

    public school(classroom[] c, String p) {
        classes = c;
        principal = p;
    }

    public classroom[] getClasses() {
        return classes;
    }
    public String getPrincipal() {
        return principal;
    }
    public void setClasses(classroom[] c) {
        classes = c;
    }
    public void setPrincipal(String p) {
        principal = p;
    }
}
