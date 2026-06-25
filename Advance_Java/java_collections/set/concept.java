package Advance_Java.java_collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class concept {
    public static void main(String[] args) {
        /* Set<Integer> nums = new HashSet<Integer>(); */
        Set<Integer> nums = new TreeSet<Integer>(); // values are arranged in sorted(ascending) order.
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        /* nums.add(8); */

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}

