package Advance_Java.exception;

public class try_with_multiple_catch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e) {
            System.err.println("Exception : " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception : " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Something Wrong Wrong : " + e);
        }

        System.out.println("Bye...");
    }
}
