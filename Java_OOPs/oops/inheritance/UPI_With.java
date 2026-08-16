package oops.inheritance;

class Payment {

    void paymentSuccess() {
        System.out.println("Payment successful!");
    }
}

class UPI extends Payment {

    void payUsingUPI() {
        System.out.println("Paid ₹299 using UPI");
    }
}

class CreditCard extends Payment {

    void payUsingCard() {
        System.out.println("Paid ₹299 using Credit Card");
    }
}

public class UPI_With {

    public static void main(String[] args) {

        UPI upi = new UPI();

        upi.payUsingUPI();
        upi.paymentSuccess();


        CreditCard card = new CreditCard();

        card.payUsingCard();
        card.paymentSuccess();
    }
}
