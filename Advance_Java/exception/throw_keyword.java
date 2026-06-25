package Advance_Java.exception;

public class throw_keyword {
    public static void main(String[] args) {
    int i = 20;
    int j = 0;

        try {
            j = 18 / i;
            if(j == 0)
                throw new ArithmeticException();
        }
        catch(ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Exception : " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Something Wrong Wrong : " + e);
        }

        System.out.println(j);
        System.out.println("Bye...");
    }
}


