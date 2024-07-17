package programs.addEmployee;

public class Employee {
    private int id;
    private String name;
    private String des;
    private String email;
    private float salary;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee [Id= " + id + ", Name= " + name + ", Designation = " + des + ", Email= " + email + ", Salary= " + salary
                + "]";
    }

    
}
