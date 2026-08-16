package oops;

class Order {

    String foodName;
    double price;

    void placeOrder() {
        System.out.println("Order placed successfully!");
    }

    void cancelOrder() {
        System.out.println("Order cancelled!");
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {

        Order order1 = new Order();

        order1.foodName = "Pizza";
        order1.price = 299;

        Order order2 = new Order();

        order2.foodName = "Burger";
        order2.price = 199;
    }
}

