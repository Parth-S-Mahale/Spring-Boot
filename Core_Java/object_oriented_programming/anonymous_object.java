package Core_Java.object_oriented_programming;

class A {
    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class anonymous_object {
    public static void main() {
        new A(); // anonymous object
        new A().show();
    }
}
