package casestudy.goshoppingapp;

abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;

    public ShopAcc(String accNm, int accNo, float charges){
        this.accNm = accNm;
        this.accNo = accNo;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getCharges() {
        return charges;
    }

    public void setCharges(float charges) {
        this.charges = charges;
    }

    //methods
    public void bookProduct(float amount){
        float totalCost = amount + charges;
        System.out.println("Product Booked. Charges: "+totalCost);

    }

    public void items(float itemsCost){
        System.out.println("Items added to cart. Cost: "+itemsCost);
    }

    @Override
    public String toString() {
        return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
    }

    
}
