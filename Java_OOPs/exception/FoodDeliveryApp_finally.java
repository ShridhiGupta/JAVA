package exception;

public class FoodDeliveryApp_finally {
    public static void main(String[] args) {
        try {

            int amount = 0;
            int result = 500 / amount;

        } catch (ArithmeticException e) {

            System.out.println("Payment failed.");

        } finally {

            System.out.println("Payment process completed.");
        }
    }
}
