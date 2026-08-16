package oops.abstraction;

interface Payment {

    void pay(double amount);
}

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class FoodDeliveryApp_interface {

    public static void main(String[] args) {

        Payment payment1 = new UPI();
        payment1.pay(499);

        Payment payment2 = new CreditCard();
        payment2.pay(799);
    }
}