public class classroom {
    private student[] students;
    private String classroomName;

    public classroom(student[] s, String c) {
        students = s;
        classroomName = c;
    }

    public student[] getStudents() {
        return students;
    }
    public String getClassroomName() {
        return classroomName;
    }
    public void setStudents(student[] s) {
        students = s;
    }
    public void setClassroomName(String c) {
        classroomName = c;
    }
}
