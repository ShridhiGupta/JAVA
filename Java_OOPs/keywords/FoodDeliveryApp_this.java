package keywords;

class Order1 {

    String foodName;

    Order1(String foodName) {
        this.foodName = foodName;
    }
}

public class FoodDeliveryApp_this {

    public static void main(String[] args) {

        Order1 order = new Order1("Pizza");

        System.out.println(order.foodName);
    }
}