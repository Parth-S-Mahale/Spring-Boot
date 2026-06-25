package Advance_Java.abstraction;

public class abstract_and_inner_class {
    public static void main(String[] args) {
        Demo1 obj = new Demo1() {

            public void show() {
                System.out.println("in inner show");
            }

            public void run() {
                System.out.println("in inner run");
            }

        };
        obj.show();
        obj.run();
    }
}

abstract class Demo1 {
    public abstract void show();
    public abstract void run();
}

/* class Demo2 extends Demo1 {
    public void show() {
        System.out.println("in Demo2 show");
    }
} */
