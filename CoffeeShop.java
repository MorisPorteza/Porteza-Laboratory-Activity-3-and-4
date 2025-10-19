public class CoffeeShop {
    public static void main(String[] args) {
        // 1. Create at least three Customer objects
        Customer joseph = new Customer("Joseph", 200);
        Customer peter = new Customer("Peter");
        Customer unknown = new Customer();

        // 2. Peter earns points from transactions
        peter.addPoints(200); // pastries and beverages
        System.out.println("Peter earned 200 points. Total Points: " + peter.getPoints());
        peter.addPoints(20);  // water
        System.out.println("Peter earned 20 points. Total Points: " + peter.getPoints());
        System.out.println();

        // 3. Try to redeem rewards for all customers
        joseph.redeemReward();
        peter.redeemReward();
        unknown.redeemReward();
        System.out.println();

        // 4. Display each customer's info and total customers
        joseph.displayCustomerInfo();
        peter.displayCustomerInfo();
        unknown.displayCustomerInfo();
        Customer.displayTotalCustomers();
        System.out.println();

        // 5. A fourth customer comes in (Diane)
        Customer diane = new Customer("Diane");
        diane.addPoints(50);
        System.out.println("Diane earned 50 points. Total Points: " + diane.getPoints());
        Customer.displayTotalCustomers();
        System.out.println();

        // 6. Show how many rewards each customer can redeem
        Customer.getAllowedRewardsRedemption(joseph);
        Customer.getAllowedRewardsRedemption(peter);
        Customer.getAllowedRewardsRedemption(diane);
        Customer.getAllowedRewardsRedemption(unknown);
    }
}


// Porteza, Moris L.
