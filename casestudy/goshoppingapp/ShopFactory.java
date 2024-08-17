package casestudy.goshoppingapp;

public abstract class ShopFactory{

    public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
}