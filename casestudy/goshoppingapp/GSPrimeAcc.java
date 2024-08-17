package casestudy.goshoppingapp;

public class GSPrimeAcc extends PrimeAcc{
   private static float Charges;
   
   public GSPrimeAcc(int accNo,String accNm,float charges,boolean isPrime){
    super(accNm,accNo,charges,isPrime);
   }

   @Override
   public void bookProduct(float amount) {

    //    float discount = 10.0f / 100;
    //    float totalCost = amount * discount;
    //    System.out.println("Discount: "+discount);
       System.out.println("GS Prime Account - Exclusive offer applied!. Total Amount: " +amount);
       
   }
   
}
