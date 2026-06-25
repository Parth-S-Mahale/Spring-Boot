package Advance_Java.interfaces;

public class concept {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        /* A.area = "Hyderabad"; */ // Cannot assign a value to final variable 'area'

        System.out.println(A.area);
    }
}

interface A {

    int age = 21; // final and static
    String area = "Mumbai";

    void show();
    void config();
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}
