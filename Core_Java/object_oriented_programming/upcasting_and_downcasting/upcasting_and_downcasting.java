package Core_Java.object_oriented_programming.upcasting_and_downcasting;

class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class upcasting_and_downcasting {
    static void main() {
        A obj1 = (A) new B(); // upcasting
        obj1.show1();

        B obj2 = (B) obj1; // downcasting
        obj2.show2();
    }
}
