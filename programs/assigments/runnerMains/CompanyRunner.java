package programs.assigments.runnerMains;

import programs.assigments.utilities.EmployeeUtilities;

public class CompanyRunner {
    public static void main(String[] args) {
        EmployeeUtilities employeeUtilities = new EmployeeUtilities();
        employeeUtilities.developerDetail();
        employeeUtilities.managerDetail();
    }
}


// CompanyRunner ~ Main class
// employee package have Developer,Employee,Manager ~ developer & manager extends the employee and user dataMember of Employee class also both have own 1 diffrent datamember
// utilities package have employeeUtilities that conains all the logic of the program it manage take developer & Manager part

// Package exercise

// Objective: To demonstrate understanding of Java packages and access modifiers. Instructions: 
// Create a Package Structure: Create a Java package named com.yourname.assignment. • 
// Inside this package, create two sub-packages named employees and utilities. 

//  Employees Package: Inside the employees package, create a class named Employee. • Include private attributes such as name, employeeId, and salary. • Implement appropriate access modifiers (e.g., private, protected, public) for the class members. • Provide getter and setter methods to access and modify the private attributes

//  Subclasses: • Create two subclasses within the employees package: Manager and Developer. • Each subclass should extend the Employee class. • Introduce additional attributes specific to managers and developers. • Implement getter and setter methods for the additional attributes. 


// Utilities Package: • Inside the utilities package, create a class named EmployeeUtilities. • Implement methods in EmployeeUtilities that use the employees from the employees package. • Demonstrate the proper usage of access modifiers within the EmployeeUtilities class. 
// Main Class: • Create a main class named AssignmentMain outside of any package. • In the AssignmentMain class, create instances of Manager and Developer. • Use the EmployeeUtilities methods to perform operations on the employee objects. 
// Documentation: • Provide Javadoc comments for each class and method, emphasizing the proper use of access modifiers
