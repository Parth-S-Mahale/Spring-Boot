package Core_Java.object_oriented_programming.inheritance;

class A  { // class A extends Object (Implicitly)
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }

}

class B extends A{
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        // super(n);
        this();
        System.out.println("in B int");
    }
}

public class this_super_method {
    static void main() {
        // B obj1 = new B();
        System.out.println();
        B obj2 = new B(5);
    }
}
