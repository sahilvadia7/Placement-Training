package programs.practice.employee;

import java.util.Scanner;

public class EmployeeDetail {
    private int EmployeeArrayLength;
    static int id=1;

    
    public void addEmployee(){
    
        Scanner input = new Scanner(System.in);

        System.out.print("How many record you want to enterd : ");
        EmployeeArrayLength = input.nextInt();

        Employee[] employee = new Employee[EmployeeArrayLength];
        

        for(int i=0; i<employee.length; i++){


        // ArryaOfObject {Making array of employee class and use it ;) }
            employee[i] = new Employee();
            
            System.out.println("\nEnter the data of "+i+" th Employee");

            employee[i].setEmployeeId(id);

            System.out.print("Enter Employee Name : ");
            employee[i].setEmployeeName(input.next());

            System.out.print("Enter Employee Designation : ");
            employee[i].setDesignation(input.next());

            id++;
        }


        for(int i=0; i<employee.length; i++){
            System.out.println("\nEmployee id : "+employee[i].getEmployeeId());
            System.out.println("Employee Name : "+employee[i].getEmployeeName());
            System.out.println("Employee Designation : "+employee[i].getDesignation());

        }


    }
}
