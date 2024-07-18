package programs.collage;

public class Collage {
    public static void main(String[] args) {

        StudentDetails course = new StudentDetails();
        course.addCourse();

        StudentDetails student = new StudentDetails();
        student.addStudentDetail();
        student.printStudentDetail();
    }
}
