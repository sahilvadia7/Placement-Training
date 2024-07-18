package programs.collage;

class Student{

    private int EnrollmentNo;
    private String StudentName,CourseId;

    
    public int getEnrollmentNo() {
        return EnrollmentNo;
    }
    public void setEnrollmentNo(int enrollmentNo) {
        EnrollmentNo = enrollmentNo;
    }
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public String getCourseId() {
        return CourseId;
    }
    public void setCourseId(String CourseId) {
        CourseId = CourseId;
    }
   
    @Override
    public String toString() {
        return "student [EnrollmentNo=" + EnrollmentNo + ", StudentName=" + StudentName + ", CourseId=" + CourseId
                + "]";
    }

    
}