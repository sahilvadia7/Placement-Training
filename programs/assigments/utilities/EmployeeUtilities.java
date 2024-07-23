package programs.assigments.utilities;

import java.util.Scanner;

import programs.assigments.employee.Developer;
import programs.assigments.employee.Manager;

public class EmployeeUtilities {

    Scanner in = new Scanner(System.in);
    static Developer[] developer;
    static Manager[] manager;

    public void developerDetail(){
        int id=1;

        System.out.print("How many Developer added? : ");
        int developerLength = in.nextInt();
    
        developer = new Developer[developerLength];
        

        for(int i=0; i<developer.length; i++){
            developer[i] = new Developer();

            developer[i].setEmployeeId(id);

            System.out.print("\nEnter developer name : ");
            developer[i].setEmployeeName(in.next());
    
            System.out.print("Enter salary : ");
            developer[i].setSalary(in.nextInt());
    
            System.out.print("Technology : ");
            developer[i].setTechnology(in.next());
            id++;
        }
      

        showDeveloperDetails();
    }

    public void showDeveloperDetails(){

        for(int i=0; i<developer.length; i++){

            System.out.println("\nDeveloper Details");

            System.out.println("Id : "+developer[i].getEmployeeId());
            System.out.println("Developer Name : "+developer[i].getEmployeeName());
            System.out.println("Salary : "+developer[i].getSalary());
            System.out.println("Technology : "+developer[i].getTechnology());
        }
    }

    public void managerDetail(){
        int id=1;

        System.out.print("\nHow many Manager added? : ");
        int ManagerLength = in.nextInt();

        manager = new Manager[ManagerLength];

        for(int i=0; i<manager.length; i++){
            manager[i] = new Manager();

        manager[i].setEmployeeId(id);

        System.out.print("\nEnter Manager name : ");
        manager[i].setEmployeeName(in.next());

        System.out.print("Enter salary : ");
        manager[i].setSalary(in.nextInt());

        System.out.print("Email : ");
        manager[i].setEmail(in.next());
        id++;
        }

        showManagerDetails();
    }

    
    public void showManagerDetails(){

        System.out.println("\nManager Details");
        for(int i=0; i<manager.length; i++){

            System.out.println("Id : "+manager[i].getEmployeeId());
            System.out.println("Manager Name : "+manager[i].getEmployeeName());
            System.out.println("Salary : "+manager[i].getSalary());
            System.out.println("Email : "+manager[i].getEmail());
        }
    }
}
