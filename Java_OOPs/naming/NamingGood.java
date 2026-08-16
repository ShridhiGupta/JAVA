package naming;

import java.util.Scanner;

public class NamingGood {

    private static void displayUserInfo(int age, String name) {
        System.out.println(
            "Your name is " + name +
            " and your age is " + age +
            " and you've used good naming"
        );
    }

    public static void main(String[] args) {

        int age;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        displayUserInfo(age, name);

        scanner.close();
    }
}