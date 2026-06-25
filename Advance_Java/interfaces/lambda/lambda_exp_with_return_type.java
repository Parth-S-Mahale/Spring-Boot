package Advance_Java.interfaces.lambda;

public class lambda_exp_with_return_type {
    public static void main(String[] args) {
        test obj = (i,j) -> i + j;
        int result = obj.add(5, 6);
        System.out.println(result);
    }
}

@FunctionalInterface
interface test {
    int add(int i, int j);
}

