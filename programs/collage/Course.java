package programs.collage;

public class Course {

    private int Sem;
    private String CourseId,CourseName;
    
    public int getSem() {
        return Sem;
    }
    public void setSem(int sem) {
        Sem = sem;
    }
    public String getCourseId() {
        return CourseId;
    }
    public void setCourseId(String courseId) {
        CourseId = courseId;
    }
    public String getCourseName() {
        return CourseName;
    }
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
    @Override
    public String toString() {
        return "Course [Sem=" + Sem + ", CourseId=" + CourseId + ", CourseName=" + CourseName + "]";
    }


    

    
}
