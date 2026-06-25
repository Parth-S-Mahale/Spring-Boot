package Core_Java.methods;
class calculator {
    // original add function
    public int add(int a, int b) {
        return a + b;
    }

    // overloading add function with one more parameter {int c}
    public double add(int a, int b, int c) {
        return a + b + c;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 3;
        calculator calc = new calculator();
        int add1 = calc.add(a, b);
        double add2 = calc.add(a, b, c);
        System.out.println("Addition of a + b = " + add1);
        System.out.println("Addition of a + b + c = " + add2);
    }
}
