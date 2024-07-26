package programs.assigments.movie;

import java.util.Scanner;

public class MovieBookingMain {
    
    public static void main(String[] args) {

        TicketBookingDetail ticketBookingDetail = new TicketBookingDetail();


        Scanner se = new Scanner(System.in);
        int opt;
        do{

            System.out.println("\nMovie booking\n");
            System.out.println("1. Add Movies");
            System.out.println("2. Show Movies");
            System.out.println("3. Book Ticket");

            System.out.println("0. exit");
            System.out.print("Select option : ");
            opt = se.nextInt();


            switch (opt) {
                case 1:
                    ticketBookingDetail.AddMoives();                  
                    break;
            
                case 2:
                    ticketBookingDetail.ShowMovie();  
                    break;

                case 3:
                    ticketBookingDetail.AddTicketBooking();
                    break;
                       
                default:
                    break;
            }

        }while(opt!=0);
    }
}
