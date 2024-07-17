package programs.carCenter;

import java.util.Random;
import java.util.Scanner;

class CarCentar{

    private static int id,opt,conut,days;
    private static String CarSelect;
    static Scanner se = new Scanner(System.in);
     
    

public static void main(String[] args) {

    do{

        if(conut==0){
            System.out.println("\nWelcome to Car-Rental Center");
        }
        
        System.out.println("\nSelect option");
        System.out.println("1. Show Car Typs ");
        System.out.println("2. Rent Car ");
        System.out.println("0. Exit");

        System.out.print("Enter Option (0-2) : ");
        opt = se.nextInt();

        switch (opt) {
            case 1:
                showcar();
                break;
            case 2:
                UserSelectType();
                break;
                
            default:
                System.out.println("\nThank you for visiting ;)");
                System.exit(0);
                break;
        }
        conut++;

    }while(opt!=0);



}

    static void showcar(){
    System.out.println("\nCars ");
    System.out.println("Suv cars");
    System.out.println("Van cars");
    System.out.println("Sedan cars");
    
    }   

    static void showcarWithRent(){
            System.out.println("\nCars  -     Rent");
            System.out.println("Suv car   : 2500");
            System.out.println("Van car   : 800");
            System.out.println("sedan car : 1500");
            
    }


    static void UserSelectType(){
        showcarWithRent();
        System.out.print("Select type : ");
        CarSelect = se.next();
        
        System.out.print("Enter Days for Rent : ");
        days = se.nextInt();
        rentCar(CarSelect,days);
    }

    static void rentCar(String carType,int days){
        id = idGenerater();
        getcar(id, carType,days);
    }

    static int idGenerater(){
        Random r = new Random();
        int randomId;
        return randomId = r.nextInt(1000);
    }


    static void getcar(int carId,String carType,int days){
        System.out.println("\nYour Renatal details");
        System.out.println("CarId : "+carId);
        System.out.println("Car Type : "+carType);
        if (carType.equalsIgnoreCase("SUV")) {
            System.out.println("Your Bill is : "+(2500*days) );
        }
        else if (carType.equalsIgnoreCase("SEDAN")) {
            System.out.println("Your Bill is : "+(1500*days) );
        }
        else{
            System.out.println("Your Bill is : "+(800*days));
        }
    }
}