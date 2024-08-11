package exceptions;

import java.util.Scanner;

public class exception1 {

   private int number;

   public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
   
    @Override
    public String toString() {
    return "exception1 [number=" + number + "]";
}



    public static void main(String[] args) {

        
        Scanner se=new Scanner(System.in);
        exception1 e1= new exception1();
        // Generating normal exception {User enter worng type of input}
        // Exception ocuured when something gose worng at Runtime
        // Handle with try & Catch Block
        // In the try we wrrap the statement that may occured exception
        // Catch will handle the exception according define 
        // Exception is a main class that handle all the type of exception 
        // you don't won't to mention it by type or name. ex ArithmaticException

        // NOte : Only try allow in java when finally block was initilize.
        // Don't write any code between the try & Catch or Finally block it give you error

        // here we use nextInt for user number but if user enter String inti it throw the exception
        
        try{
            System.out.print("Enter Your Number : ");
            e1.setNumber(se.nextInt());
            System.out.println("Your name is : "+e1.getNumber());
        }
        catch(Exception e){
            System.out.println(e);
        }

    }



    
}
