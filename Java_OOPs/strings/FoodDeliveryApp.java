package strings;

public class FoodDeliveryApp {


    public static void equalsConcept(){
        String food1 = "Pizza";
        String food2 = "Pizza";

        System.out.println(food1 == food2);
        System.out.println(food1.equals(food2));
    }


    public static void main(String[] args) {

        String food = "Burger";
        String address = "Delhi";

        System.out.println("Food: " + food);
        System.out.println("Delivery Address: " + address);

        equalsConcept();
    }
}


