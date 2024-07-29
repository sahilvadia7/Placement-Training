package programs.assigments.movie;

import java.util.Scanner;


public class TicketBookingDetail {


    private int noMovies;
    private static String Usermoive;
    Integer noOfSeats;
    String paymentMethod;
    double moivePrice;


    Scanner sc = new Scanner(System.in);
    Movies[] movies;

    public void AddMoives() {

        //creating movie array
        System.out.print("How Many Movie You Enter : ");
        noMovies = sc.nextInt();
        movies = new Movies[noMovies];

        for(int i=0; i<movies.length; i++){
            //creatind new object of moive for all the index
            movies[i] = new Movies();
         
            System.out.println("\nEnter "+(i+1)+" Movie Detail");

            System.out.print("Movie Name : ");
            movies[i].setMovieName(sc.next());

            System.out.print("Movie Description : ");
            movies[i].setDescription(sc.next());

            System.out.print("Price : ");
            movies[i].setPrice(sc.nextDouble());
            
        }

    }


    //display all the movie added by admin
    public void ShowMovie() {

        System.out.println("\n\nMovies\n");
        
       try{
            for(int i=0; i<movies.length; i++){

                System.out.println("Moive "+(i+1));
                System.out.println("Movie : "+movies[i].getMovieName());
                System.out.println("Description : "+movies[i].getDescription());
                System.out.println("Price : "+movies[i].getPrice());
            }

            System.out.print("Select Movie By Name : ");       
            Usermoive = sc.next();
       }catch(NullPointerException e){
            System.out.println("Oops ~ Data Not Found");
       }

        
    }

    //booking the ticket

    public void AddTicketBooking(){
        Movies selectedMovie = null;
      
        // Find the movie selected by the user
       
       try{ 
            for (Movies movie : movies) {
                if (movie.getMovieName().equalsIgnoreCase(Usermoive)) {
                    selectedMovie = movie;
                    moivePrice = movie.getPrice();
                    break;
                }
            }
        }catch(NullPointerException e){
            System.out.println("\nFirst Select The Movie");
            return;
        }
   
        Customer customer = new Customer();
        System.out.print("Enter user Name :");
        customer.setCustomerName(sc.next());

        System.out.print("Enter Number of seats : ");
        noOfSeats = (Integer) sc.nextInt();

        System.out.print("Enter Payment Type (cash,craditcard,wallet) : ");
        paymentMethod = sc.next();



        // passing value in ticketbooking
        TicketBooking ticketBooking = new TicketBooking(selectedMovie, customer,noOfSeats,paymentMethod);

        

        //checking payment method
        if(ticketBooking.getPaymentMethod().equalsIgnoreCase("cash")){
            makePayment(ticketBooking,moivePrice);
       }
       else if(ticketBooking.getPaymentMethod().equalsIgnoreCase("wallet")){
        System.out.print("\nEnter wallet No : ");
        String walletno = sc.next();
        makePayment(ticketBooking,walletno, moivePrice);
       }
       else{
        System.out.print("Enter Card Number : ");
        String cardNo = sc.next();

        System.out.print("Enter CVV : ");
        String cvv = sc.next();

        makePayment(ticketBooking,cardNo,cvv,moivePrice);
        
       }
       
            
    }

      //overriding method for payment

    private static void makePayment(TicketBooking ticketBooking,double amount){
        System.out.println("\n\n\tPayment Method : "+ticketBooking.getPaymentMethod());

        System.out.println("\n\tCustomer Name : "+ticketBooking.getCustomer().getCustomerName());
        System.out.println("\tNumber Of Seats : "+ticketBooking.getNoOfSeats());
        System.out.println("\tPrice of Movie  : "+amount);
        System.out.println("\tTotal Bill : "+(amount*ticketBooking.getNoOfSeats()));
    }

     
    private static void makePayment(TicketBooking ticketBooking,String walletNumber,double amount){
        System.out.println("\n\n\tPayment Method : "+ticketBooking.getPaymentMethod());

        System.out.println("\n\tCustomer Name : "+ticketBooking.getCustomer().getCustomerName());
        System.out.println("\tWallet Number : "+walletNumber);
        System.out.println("\tNumber Of Seats : "+ticketBooking.getNoOfSeats());
        System.out.println("\tPrice of Movie  : "+amount);
        System.out.println("\tTotal Bill : "+(amount*ticketBooking.getNoOfSeats()));
    }

    private static void makePayment(TicketBooking ticketBooking,String cardNo,String cvv,double amount){
        System.out.println("\n\n\tPayment Method : "+ticketBooking.getPaymentMethod());

        System.out.println("\n\tCustomer Name : "+ticketBooking.getCustomer().getCustomerName());
        System.out.println("\tCard Number : "+cardNo);
        System.out.println("\tNumber Of Seats : "+ticketBooking.getNoOfSeats());
        System.out.println("\tPrice of Movie  : "+amount);
        System.out.println("\tTotal Bill : "+(amount*ticketBooking.getNoOfSeats()));

    }

}
