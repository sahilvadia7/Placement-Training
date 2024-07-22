package programs.practice.employee;


public class Employee {
    private int EmployeeId;
    private String EmployeeName;
    private String Designation;

    
    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }
    @Override
    public String toString() {
        return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Designation=" + Designation
                + "]";
    }


}
