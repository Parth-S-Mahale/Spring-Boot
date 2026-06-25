package Advance_Java.threads.runnable_vs_thread;

public class concept {
    public static void main(String[] args) {

        // creating reference of parent class(Runnable) and object of child class(A & B)

        /* Runnable obj1 = new A(); */
        /* Runnable obj2 = new B(); */

        // using lambda expression
        Runnable obj1 = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }
            };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

/*class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
        }
    }
}*/

/*class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
        }
    }
}*/
