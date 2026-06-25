package Advance_Java.stream_api.method_reference;

import java.util.Arrays;
import java.util.List;

public class concept {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Parth", "Harsh", "John");

        // traditional way
        /*List<String> uNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();*/
        /*System.out.println(uNames);*/

        // better way
        List<String> uNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        uNames.forEach(System.out::println);
    }
}
