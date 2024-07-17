package Placement_Arrays;

import java.util.Scanner;

public class BasicArray {

    // arrLength Use for length of the Array
    static int arrLength;

    // Scanner for take UserInput
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      
        //define arrays with dynamic size
        int UserIn[] = new int[getLenght(arrLength)];

        //calling method & close Scanner 
        UserINPUT(UserIn);
        PrintArray(UserIn);
        sc.close();
    }

    //get length of array form user
    public static int getLenght(int arrLength){
        // User Input with exception handling 
        System.out.print("Enter the length of Array : ");
        try{
            arrLength = sc.nextInt();
        }catch(Exception e){
            System.out.println(e);
        }
        return arrLength;
    }

    //Print Array
    public static void PrintArray(int[] userIn) {
        System.out.print("Your Array is : [ ");
        for(int i=0; i<userIn.length; i++){
            System.out.print(userIn[i]+" ");
        }
        System.out.print("]");

    }


    //User input 
    public static void UserINPUT(int[] userIn){
        
        for(int i=0; i<userIn.length; i++){
            System.out.print("Enter element of array on "+i+" th index: ");
            userIn[i] = sc.nextInt();
        }
    }
}
