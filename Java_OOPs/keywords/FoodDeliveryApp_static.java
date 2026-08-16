package keywords;

class Order {

    static int totalOrders = 0;

    Order() {
        totalOrders++;
    }
}

public class FoodDeliveryApp_static {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();

        System.out.println(Order.totalOrders);
    }
}
