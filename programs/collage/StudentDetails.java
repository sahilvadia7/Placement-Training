package programs.collage;

import java.util.Scanner;

public class StudentDetails {

    private int studentlength,courselength;
    static Scanner sc = new Scanner(System.in);
    static Student[] student;
    static Course[] course;
    static Scanner se = new Scanner(System.in);
    


    void addStudentDetail(){

        

        System.out.print("Enter student record enter : ");
        studentlength = sc.nextInt();

        student = new Student[studentlength];


        for(int i=0; i<student.length; i++){
            student[i] = new Student();
        
            System.out.println("Enter the details of "+i+" student");

            System.out.print("Enter course-id : ");
            student[i].setCourseId(se.next());

            System.out.print("Enter the StudentName : ");
            student[i].setStudentName(se.next());

            System.out.print("Enter EnrollmentNo : ");
            student[i].setEnrollmentNo(se.nextInt());

        }
    }


    void printStudentDetail(){

        System.out.println("Student's Personal Detail's");
            for(int i=0; i<student.length; i++){
                System.out.println(student[i]);
            }

        System.out.println("Student's Academic Detail's");
        for(int i=0; i<course.length; i++){
            System.out.println(course[i]);
        }
    }


    void addCourse(){
        
        System.out.print("Enter course record enter : ");
        courselength = sc.nextInt();
        course = new Course[courselength];

        for(int i=0; i<course.length; i++){
            course[i] = new Course();
        
            System.out.println("Enter the details of "+i+" Course");

            System.out.print("Enter course-id : ");
            course[i].setCourseId(se.next());

            System.out.print("Enter the StudentSem : ");
            course[i].setSem(se.nextInt());

            System.out.print("Enter CourseName : ");
            course[i].setCourseName(se.next());

        }

    }
}
