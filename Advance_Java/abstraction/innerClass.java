package Advance_Java.abstraction;

public class innerClass {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        /* A.B obj2 = obj1.new B(); */ // --> this will work only when class B is not declared as static
        /* obj2.config(); */

        A.B obj3 = new A.B(); // --> this will work only when class B is declared as static
        obj3.config();
    }
}

class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B {
        public void config() {
            System.out.println("in config");
        }
    }

}




