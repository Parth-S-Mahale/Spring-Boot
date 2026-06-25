package Core_Java.classes_and_objects;
class Calculator {
    int a;
    public int add(int a, int b) {
        System.out.println("Inside ADD");
        return a + b;
    }
}

public class class_object {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        // Creating Instance/Object of class Main
        Calculator calc = new Calculator();
        int add = calc.add(num1, num2);

        System.out.println("Addition of num1 + num2 = " + add);
    }
}