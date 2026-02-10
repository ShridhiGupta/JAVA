package work;

public class Main {
    public static void main(String[] args) {

        System.out.println("My system has started");

//        MyInterfaceImplement myInterfaceImplement = new MyInterfaceImplement();
//        myInterfaceImplement.sayHello();

//        MyInterface i = new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is first anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInterface i2 = new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is second anonymous class");
//            }
//        };
//        i2.sayHello();

        // using our interface with the help of lambda

        MyInterface i =  () -> {
            System.out.println("This is first time, I'm using lambda");
        };

        i.sayHello();

        MyInterface i2 = ()-> System.out.println("This is second time, I'm using lambda");
        i2.sayHello();

//        SumInterface sumInterface = (int a, int b)->{
//            return a+b;
//        };
        SumInterface sumInterface = (a, b) -> a+b;
        System.out.println(sumInterface.sum(2, 3));
        System.out.println(sumInterface.sum(5, 7));

        LengthInterface lengthInterface = str -> str.length();

        System.out.println("Length of the String: "+lengthInterface.getLength("Shridhi Gupta"));
    }
}