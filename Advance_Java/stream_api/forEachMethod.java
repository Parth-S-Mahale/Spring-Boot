package Advance_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        /* int sum = 0;
         for(int n: nums) {
             if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
             }
         }
       System.out.println(sum); */

        /* Consumer<Integer> con = new Consumer<Integer>() { // anonymous method
            public void accept(Integer n) {
                System.out.println(n);
            }
        }; */
        /* nums.forEach(con); */ // forEach method


        /* Consumer<Integer> con = n -> System.out.println(n); */ // lambda expression
        /* nums.forEach(con); */ // forEach method

        nums.forEach(n -> System.out.println(n)); // forEach method

    }
}
