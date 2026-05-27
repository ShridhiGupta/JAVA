import java.util.*;

public class Map_Example {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();
        //adding elements
        courses.put("Core Java", 4000);
        courses.put("Basic Python", 3500);
        courses.put("Spring", 8000);
        courses.put("Android", 4000);
        courses.put("Android", 4000);
        courses.put("PHP", 2414);

        System.out.println(courses);

        courses.forEach((e1, e2) -> {
            System.out.println(e1 + " => " + e2);
        });
        System.out.println(courses.get("SpringN"));
    }
}
