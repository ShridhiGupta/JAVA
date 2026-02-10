import java.util.*;

public class ThreadTester extends Thread{
    public static void main(String[] args) {
        System.out.println("Main started");
        Thread1 thread1 = new Thread1("Thread-1");
        // thread1.setDaemon(true);
        thread1.start();

        Thread2 thread2 = new Thread(new Thread2(), "Thread-2");
        thread2.start();
        System.out.println("Main is executing");
    }
}
