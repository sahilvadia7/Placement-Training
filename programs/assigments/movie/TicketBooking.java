package programs.assigments.movie;


//here only Ticket data constructor, set-get & show 

public class TicketBooking {

    private Movies moives;
    private Customer customer;
    private Integer noOfSeats;
    private String paymentMethod;

  
    public TicketBooking(Movies moives, Customer customer, Integer noOfSeats, String paymentMethod) {
        this.moives = moives;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
        this.paymentMethod = paymentMethod;
    }

    public Movies getMoives() {
        return moives;
    }
    public void setMoives(Movies moives) {
        this.moives = moives;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Integer getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    @Override
    public String toString() {
        return "TicketBooking [moives=" + moives + ", customer=" + customer + ", noOfSeats=" + noOfSeats
                + ", paymentMethod=" + paymentMethod + "]";
    }

    

}
