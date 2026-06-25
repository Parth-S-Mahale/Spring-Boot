package Advance_Java;

public class Exercise2 {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        // TODO: Handle division using try-catch
        try {
            int result = numerator / denominator;

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program completed");
    }
}
