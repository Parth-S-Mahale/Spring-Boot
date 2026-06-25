package Advance_Java.java_collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class concept {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(8);

        System.out.println("Index of number 5 = " + nums.indexOf(5));
        System.out.println("Number at index 2 = " + nums.get(2));

        for (int n : nums) {
            System.out.println("Number at index " + nums.indexOf(n) + " is = " + n);
        }
    }
}
