package programs.assigments.movie;

//here only customer data set-get & show 

public class Customer {
    private String CustomerName;

    public Customer(){

    }
    public Customer(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer [CustomerName=" + CustomerName + "]";
    }
       
}
