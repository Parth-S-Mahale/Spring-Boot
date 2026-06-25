package Advance_Java.exception;

public class concept {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye...");
    }
}
