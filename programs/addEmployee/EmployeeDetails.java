package programs.addEmployee;

import java.util.Scanner;

public class EmployeeDetails {


    private int id = 1,empLength;
    
    Scanner se = new Scanner(System.in);

    void AddEmpDetail(){

        System.out.print("How Data want to Enter : ");
        empLength = se.nextInt();

        Employee employee[] = new Employee[empLength];
        for(int i=0; i<employee.length; i++){
            employee[i] = new Employee();
        // }

        // for(int i=0; i<employee.length; i++){
            System.out.println("\nAdding Employee "+ (i+1) +" Detail");

            employee[i].setId(id);

            System.out.print("Enter Name : ");
            employee[i].setName(se.next()); 

            System.out.print("Enter Designation : ");
            employee[i].setDes(se.next());

            System.out.print("Enter Email : ");
            employee[i].setEmail(se.next());

            System.out.print("Enter Salary : ");
            employee[i].setSalary(se.nextFloat());

            id++;
        }


        for(int i=0; i<employee.length; i++){
            System.out.println(employee[i]);
        }
    }
   

}
