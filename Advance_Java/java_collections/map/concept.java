package Advance_Java.java_collections.map;

import java.util.HashMap;
import java.util.Map;

public class concept {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Parth", 21);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);
        students.put("Harsh", 45);

        System.out.println("{key1 = value1, key2 = value2,....,keyN = valueN} format as follows :");
        System.out.println(students);

        /* If you want particular key's value */
        System.out.println("{Harsh=" + students.get("Harsh") + "}");

        /* If you want all the keys */
        System.out.println("keys = " + students.keySet());

        for(String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}
