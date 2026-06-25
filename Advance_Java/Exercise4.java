package Advance_Java;

// TODO: Define PrinterTask class that implements Runnable
public class Exercise4 {
    public static void main(String[] args) throws InterruptedException{

        // TODO: Create a single PrinterTask object
        Runnable run = new PrinterTask();

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread t1 = new Thread(run, "Worker-1");
        Thread t2 = new Thread(run, "Worker-2");

        // TODO: Start both threads
        t1.start();
        t2.start();

        // TODO: Use join() to wait for both threads to finish
        t1.join();
        t2.join();
    }
}

class PrinterTask implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

