package exception;

class PaymentService {

    // 'throws' declares that this method may throw an exception
    static void processPayment(double amount)
            throws IllegalArgumentException {

        // 'throw' actually creates and throws the exception
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Payment amount must be greater than 0"
            );
        }

        System.out.println("Payment successful: ₹" + amount);
    }
}

public class FoodDeliveryApp_thowThrows {

    public static void main(String[] args) {

        try {
            PaymentService.processPayment(0);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}


