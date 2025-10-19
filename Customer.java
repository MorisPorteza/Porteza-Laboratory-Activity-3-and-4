
public class Customer {
    // Instance Variables
    private String name;
    private int points;

    // Static Variable
    private static int totalCustomers = 0;

    // ⋆⁺｡˚⋆˙‧₊☽ Constructors ☾₊‧˙⋆˚｡⁺⋆
    // Default Constructor
    public Customer() {
        this.name = "Unknown";
        this.points = 0;
        totalCustomers++;
    }

    // Parameterized Constructor (name and points)
    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    // Parameterized Constructor (name only)
    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }

    // ⋆⁺｡˚⋆˙‧₊☽ Instance Methods ☾₊‧˙⋆˚｡⁺⋆
    public void addPoints(int earnedPoints) {
        this.points += earnedPoints;
    }

    public void redeemReward() {
        if (points >= 100) {
            System.out.println("Congratulations " + name + "! You redeemed a free drink!");
            points -= 100;
            System.out.println("Remaining Points: " + points);
        } else {
            System.out.println(name + " does not have enough points to redeem a drink.");
            System.out.println("Current Points: " + points);
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Points: " + points);
        System.out.println("---------------------------");
    }

    public int getPoints() {
        return points;
    }

    // ⋆⁺｡˚⋆˙‧₊☽ Static Methods ☾₊‧˙⋆˚｡⁺⋆
    public static void displayTotalCustomers() {
        System.out.println("Total Registered Customers: " + totalCustomers);
    }

    public static void getAllowedRewardsRedemption(Customer customer) {
        int redeemable = customer.points / 100;
        System.out.println(customer.name + " can redeem " + redeemable + " free drink(s).");
    }
}

// Submitted by: Porteza, Moris L. (BSCS-2D)

// AI Prompt:
// You are a junior Java developer for BeanBrew Coffee Shop, a café that wants to automate its customer rewards system. 
// Every customer earns points for every purchase. When a customer reaches 100 points, they can redeem a free drink. 
// The shop also wants to keep track of how many customers have registered in the system.
// I will be giving six instructions one at a time throughout our conversation.
// Carefully follow each one and gradually build the program step by step as new features are introduced.
// The project should consist of two Java files: Customer.java and CoffeeShop.java.
// Ensure that the code runs and compiles correctly after every update.
// After completing each step, include a clear explanation of what was added and which Java concepts were applied.
// Keep your explanations easy to follow and beginner-friendly, as if you’re teaching the basics of Java OOP.

// AI Model: GPT-5 (ChatGPT)

// Transaction ID: https://chatgpt.com/share/68f4f134-8e08-8013-b568-7f35ea3c789f

// Line art sourced from: https://emojicombos.com/border
