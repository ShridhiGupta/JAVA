package first;

class Box<T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class genericClass {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>();

        box.setValue(100);
        // box.setValue("Hello");

        Integer value = box.getValue(); 

        System.out.println(value);
    }
}