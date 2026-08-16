package naming;

import java.util.Scanner;

public class NamingBad {

    private static void cs(int a, String x) {
        System.out.println(
            "Your name is " + x +
            " and your age is " + a +
            " and you've did bad naming"
        );
    }

    public static void main(String[] args) {

        int a;
        String x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        x = sc.nextLine();

        System.out.print("Enter your age: ");
        a = sc.nextInt();

        cs(a, x);

        sc.close();
    }
}