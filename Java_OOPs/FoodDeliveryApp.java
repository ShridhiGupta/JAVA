// Complete OOP POC
// Food Delivery Management System

// ======================================================
// 1. INTERFACE - ABSTRACTION
// ======================================================

interface Payment {

    void pay(double amount);
}


// ======================================================
// 2. ABSTRACT CLASS - ABSTRACTION
// ======================================================

abstract class FoodOrder {

    // Encapsulation - private data
    private String customerName;
    private double totalAmount;

    // Static variable - shared by all objects
    static String platformName = "FoodExpress";

    // Final variable - cannot be changed
    final String orderType = "Online";

    // Constructor
    FoodOrder(String customerName, double totalAmount) {

        // this refers to the current object
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Getter
    public String getCustomerName() {
        return customerName;
    }

    // Setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter
    public double getTotalAmount() {
        return totalAmount;
    }

    // Setter
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Normal method
    void showOrderDetails() {

        System.out.println("Platform: " + platformName);
        System.out.println("Customer: " + customerName);
        System.out.println("Order Type: " + orderType);
        System.out.println("Total Amount: ₹" + totalAmount);
    }

    // Abstract method
    // Child classes MUST implement this
    abstract void calculateDeliveryCharge();
}


// ======================================================
// 3. INHERITANCE
// ======================================================

class OnlineOrder extends FoodOrder implements Payment {

    private String foodName;

    // Constructor
    OnlineOrder(String customerName, double totalAmount, String foodName) {

        // super() calls parent constructor
        super(customerName, totalAmount);

        this.foodName = foodName;
    }

    // Getter
    public String getFoodName() {
        return foodName;
    }


    // ==================================================
    // METHOD OVERRIDING - RUNTIME POLYMORPHISM
    // ==================================================

    @Override
    void calculateDeliveryCharge() {

        System.out.println("Delivery Charge: ₹40");
    }


    // ==================================================
    // INTERFACE IMPLEMENTATION
    // ==================================================

    @Override
    public void pay(double amount) {

        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }


    // ==================================================
    // METHOD OVERLOADING - COMPILE-TIME POLYMORPHISM
    // ==================================================

    void addFood(String food) {

        System.out.println("Added: " + food);
    }

    void addFood(String food, int quantity) {

        System.out.println(
            "Added: " + food + " x " + quantity
        );
    }


    // Using super to access parent method
    void showFullOrder() {

        super.showOrderDetails();

        System.out.println("Food: " + foodName);
    }
}



// 4. ANOTHER CHILD CLASS


class CODOrder extends FoodOrder {

    CODOrder(String customerName, double totalAmount) {

        super(customerName, totalAmount);
    }

    // Method overriding
    @Override
    void calculateDeliveryCharge() {

        System.out.println("Delivery Charge: ₹30");
    }
}


// ======================================================
// 5. MAIN CLASS
// ======================================================

public class FoodDeliveryApp {

    public static void main(String[] args) {

        System.out.println("===== FOOD DELIVERY SYSTEM =====");


        // ==================================================
        // CLASS + OBJECT
        // ==================================================

        OnlineOrder order =
            new OnlineOrder(
                "Shree",
                599,
                "Margherita Pizza"
            );


        // ==================================================
        // ENCAPSULATION
        // ==================================================

        System.out.println(
            "\nCustomer: " + order.getCustomerName()
        );

        order.setCustomerName("Shree Gupta");

        System.out.println(
            "Updated Customer: "
            + order.getCustomerName()
        );


        // ==================================================
        // INHERITANCE
        // ==================================================

        order.showOrderDetails();


        // ==================================================
        // ABSTRACTION
        // ==================================================

        order.calculateDeliveryCharge();


        // ==================================================
        // INTERFACE
        // ==================================================

        order.pay(order.getTotalAmount());


        // ==================================================
        // METHOD OVERLOADING
        // ==================================================

        System.out.println("\n--- Method Overloading ---");

        order.addFood("Burger");

        order.addFood("Burger", 2);


        // ==================================================
        // SUPER
        // ==================================================

        System.out.println("\n--- Using super ---");

        order.showFullOrder();


        // ==================================================
        // RUNTIME POLYMORPHISM
        // ==================================================

        System.out.println("\n--- Runtime Polymorphism ---");

        FoodOrder order1 =
            new OnlineOrder(
                "Rahul",
                499,
                "Burger"
            );

        FoodOrder order2 =
            new CODOrder(
                "Priya",
                699
            );

        order1.calculateDeliveryCharge();

        order2.calculateDeliveryCharge();


        // ==================================================
        // INTERFACE POLYMORPHISM
        // ==================================================

        System.out.println("\n--- Interface Polymorphism ---");

        Payment payment =
            new OnlineOrder(
                "Aman",
                399,
                "Pizza"
            );

        payment.pay(399);


        // ==================================================
        // STATIC
        // ==================================================

        System.out.println("\n--- Static ---");

        System.out.println(
            "Platform: " + FoodOrder.platformName
        );


        // ==================================================
        // FINAL
        // ==================================================

        System.out.println("\n--- Final ---");

        System.out.println(
            "Order Type: " + order.orderType
        );

        // order.orderType = "Offline";
        // ❌ ERROR: final variable cannot be changed
    }
}