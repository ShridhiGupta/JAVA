package exception;

public class FoodDeliveryApp_tryCatch {

    public static void main(String[] args) {

        try {

            int amount = 0;

            int result = 500 / amount;

            System.out.println("Payment successful: ₹" + result);

        } catch (ArithmeticException e) {

            System.out.println("Payment failed: Invalid amount.");
        }
    }
}