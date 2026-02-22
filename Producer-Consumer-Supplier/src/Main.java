//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Predicate Usage
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        nums.stream()
                .filter(n -> n > 3)   // Predicate used internally
                .forEach(System.out::println);





        // Consumer Usage
        Consumer<String> print = s -> System.out.println(s);

        print.accept("Hello World");

        List<String> names = List.of("Aman", "Ravi", "Shree");

        names.forEach(name -> System.out.println(name));




        // Supplier Usage
        Supplier<Double> random = () -> Math.random();

        System.out.println(random.get());

        Supplier<LocalDateTime> currentTime = () -> LocalDateTime.now();

        System.out.println(currentTime.get());

    }
}