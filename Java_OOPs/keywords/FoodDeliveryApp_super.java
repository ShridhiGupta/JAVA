package keywords;

class Payment {

    String paymentMethod = "Online Payment";

    void makePayment() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {

    String paymentMethod = "UPI";

    void showDetails() {

        // Current class variable
        System.out.println("Child: " + paymentMethod);

        // Parent class variable
        System.out.println("Parent: " + super.paymentMethod);

        // Calling parent class method
        super.makePayment();
    }
}

public class FoodDeliveryApp_super {

    public static void main(String[] args) {

        UPI payment = new UPI();

        payment.showDetails();
    }
}
