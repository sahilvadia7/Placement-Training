package casestudy.goshoppingapp;


    public class GSShopFactory extends ShopFactory {
        @Override
        public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
            return new GSPrimeAcc(accNo, accNm, charges, isPrime);
        }
    
        // @Override
        // public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
        //     return new GSNormalAcc(accNo, accNm, charges, deliveryCharge);
        // }
    }
    

