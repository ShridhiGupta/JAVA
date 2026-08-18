package oops.abstraction;

class Outer {
    interface Inner {
        void display();
    }
}

public class nested implements Outer.Inner{
    
    public void display(){
        
        System.out.println(
            "Hello from Nested Interface Inside a Class!");
    }

    public static void main(String[] args){
        
        Outer.Inner obj = new nested();
        obj.display();
    }
}