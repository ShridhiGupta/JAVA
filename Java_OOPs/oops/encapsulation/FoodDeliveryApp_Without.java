package oops.encapsulation;

class Order {
    String foodName;
    double price;
}

public class FoodDeliveryApp_Without {
    public static void main(String[] args) {

        Order order = new Order();

        order.foodName = "Pizza";
        order.price = 299;

        // Anyone can directly modify the data
        order.price = -500;

        System.out.println("Food: " + order.foodName);
        System.out.println("Price: " + order.price);
    }
}