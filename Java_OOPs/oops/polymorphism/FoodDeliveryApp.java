package oops.polymorphism;

class Payment {

    void pay() {
        System.out.println("Making payment...");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

public class FoodDeliveryApp {

    public static void main(String[] args) {

        Payment payment1 = new UPI();
        Payment payment2 = new CreditCard();
        Payment payment3 = new Payment();

        payment1.pay();
        payment2.pay();
        payment3.pay();
    }
}
