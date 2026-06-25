package Advance_Java.interfaces.lambda;

public class concept {
    public static void main(String[] args) {
        /* A obj = (int i) -> System.out.println("in show : " + i); */
        A obj = i -> System.out.println("in show : " + i);
        obj.show(5);
    }
}

@FunctionalInterface
interface A {
    void show(int i);
}