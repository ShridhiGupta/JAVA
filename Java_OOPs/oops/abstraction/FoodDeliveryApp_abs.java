package oops.abstraction;

abstract class Payment {

    abstract void pay();

    void paymentSuccess() {
        System.out.println("Payment successful!");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Processing UPI payment...");
        System.out.println("Connecting to UPI gateway...");
        System.out.println("Verifying transaction...");
    }
}

public class FoodDeliveryApp_abs {

    public static void main(String[] args) {

        Payment payment = new UPI();

        payment.pay();
        payment.paymentSuccess();
    }
}