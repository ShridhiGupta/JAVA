package oops.polymorphism;

class FoodOrder {

    // 1. No arguments
    void placeOrder() {
        System.out.println("Order placed with default details.");
    }

    // 2. One argument
    void placeOrder(String item) {
        System.out.println("Order placed for: " + item);
    }

    // 3. Two arguments
    void placeOrder(String item, int quantity) {
        System.out.println(
            "Order placed for " + quantity + " " + item
        );
    }

    // 4. Three arguments
    void placeOrder(String item, int quantity, String address) {
        System.out.println(
            "Order placed: " + quantity + " " + item
            + " | Delivery Address: " + address
        );
    }
}

public class FoodDeliveryApp_Compile {

    public static void main(String[] args) {

        FoodOrder order = new FoodOrder();

        order.placeOrder();

        order.placeOrder("Pizza");

        order.placeOrder("Burger", 2);

        order.placeOrder("Biryani", 3, "Delhi");
    }
}