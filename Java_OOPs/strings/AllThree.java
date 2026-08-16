package strings;

public class AllThree {

    public static void main(String[] args) {

        String order = "Burger";

        order = order + " + Pizza";

        System.out.println("String:");
        System.out.println(order);


        StringBuilder builder = new StringBuilder("Burger");

        builder.append(" + Pizza");
        builder.append(" + Coke");

        System.out.println("\nStringBuilder:");
        System.out.println(builder);


        StringBuffer buffer = new StringBuffer("Burger");

        buffer.append(" + Pizza");
        buffer.append(" + Coke");

        System.out.println("\nStringBuffer:");
        System.out.println(buffer);
    }
}


