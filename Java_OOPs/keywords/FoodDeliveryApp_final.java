package keywords;

class Order {

    final double DELIVERY_CHARGE = 40.0;
}

public class FoodDeliveryApp_final {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println(order.DELIVERY_CHARGE);

        // order.DELIVERY_CHARGE = 50;  
    }
}
