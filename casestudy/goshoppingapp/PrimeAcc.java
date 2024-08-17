package casestudy.goshoppingapp;

abstract public class PrimeAcc extends ShopAcc{
    
    private boolean isPrime;

    public PrimeAcc(String accNm, int accNo,  float charges,boolean isPrime) {
        super(accNm,accNo,charges);
        this.isPrime = isPrime;
      
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean isPrime) {
        this.isPrime = isPrime;
    }






    //prime account not allow extra charges for delivery
    @Override 
    public void bookProduct(float amount){
        System.out.println("Prime Account - No extra delivery charges.");
        System.out.println("Total Amount: "+amount);

    }

    @Override
    public String toString() {
        return "PrimeAcc [isPrime=" + isPrime + ", PrimeAcc=" + super.toString() + "]";
    }

  
    

}       
