public class dec3 {
    private String name;
    private int grade;
    String stuff = "hello"; // same thing as public String stuff = "hello"

    public void setGrade(int x) {
        grade = x;
        grade = modGrade(grade);
    }

    // if u make a private method it can only be used within this file
    private int modGrade(int x) {
        if (x>100) {
            return 100;
        }
        else {
            return x;
        }
    }
}

// now in main
System.out.println(x.name) // doesnt work
System.out.println(x.stuff) // works. since it is not private