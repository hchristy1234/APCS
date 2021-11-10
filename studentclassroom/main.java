public class main {
    public static void main(String[] args) {
        classroom[] classes = new classroom[50];
        school MSJ = new school(classes, "Jeff Evans");
        student[] students = new student[35];
        classroom B2 = new classroom(students, "B2");
        student Patrick = new student("patrick", 7.5);
        student Ishaan = new student("Ishaan", 4.0);

        B2.getStudents()[0] = Patrick;
        B2.getStudents()[1] = Ishaan;

        MSJ.getClasses()[0] = B2;

        System.out.println(MSJ.getClasses()[0].getStudents()[0].getName());
    }
}
