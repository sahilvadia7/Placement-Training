package Placement_Arrays;

import static Placement_Arrays.BasicArray.*;



public class PrimeArray extends BasicArray {


    public static void main(String[] args) {
        
        // pasing length of arrays form calling BasicArray method getLenght().
        int[] PrimeArr = new int[getLenght(arrLength)];

        //calling BasicArray.java method with passing Array.
        UserINPUT(PrimeArr);
        PrintArray(PrimeArr);

        //own method of PrimeArray.java
        PrintPrimeArray(PrimeArr);
        
     
    }


    //PrimeFinder check passing number is prime number or not
    public static boolean PrimeFinder(int value){
        if (value <= 1  ) {  
            return false;  
        } 
        for(int i=2; i<= Math.sqrt(value); i++){
          
            if (value % i == 0) {  
                return false;  
            }  
        }

        return true;
    }

    
    // PrintPrimeArray is calling PrimeFinder to check number is prime or not 
    // if number is prime it will be print !
    public static void PrintPrimeArray(int[] array){

        System.out.print("\nYour Prime Value in Array is : [ ");
        for(int i=0; i<array.length; i++){

            if (PrimeFinder(array[i])) {
                System.out.print(array[i]+" ");
                
            }

        }

        System.out.print(" ]");
    }
    
}
