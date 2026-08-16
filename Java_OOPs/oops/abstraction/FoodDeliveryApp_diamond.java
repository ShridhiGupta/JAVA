package oops.abstraction;

interface Payment {

    default void pay() {
        System.out.println("Payment processed");
    }
}

interface Notification {

    default void sendNotification() {
        System.out.println("Order notification sent");
    }
}

class FoodOrder implements Payment, Notification {

    void placeOrder() {
        System.out.println("Food order placed");
    }
}

public class FoodDeliveryApp_diamond {

    public static void main(String[] args) {

        FoodOrder order = new FoodOrder();

        order.placeOrder();
        order.pay();
        order.sendNotification();
    }
}