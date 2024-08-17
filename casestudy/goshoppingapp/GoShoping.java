package casestudy.goshoppingapp;

public class GoShoping {
    public static void main(String[] args) {
        // Create the factory
        ShopFactory shopFactory = new GSShopFactory();

        // Create a Prime account
        PrimeAcc primeAcc = shopFactory.getNewPrimeAccount(101, "John Doe", 500, true);
        primeAcc.items(1);  // Adding items to cart
        primeAcc.bookProduct(1000);  // Booking product with a 10% discount
        System.out.println(primeAcc);

        // // Create a Normal account
        // NormalAcc normalAcc = shopFactory.getNewNormalAccount(102, "Jane Doe", 300, 50);
        // normalAcc.items(150);  // Adding items to cart
        // normalAcc.bookProduct(1000, 5);  // Booking product with a 5% discount
        // System.out.println(normalAcc);
    } 
}
