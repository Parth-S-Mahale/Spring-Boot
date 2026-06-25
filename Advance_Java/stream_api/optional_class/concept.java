package Advance_Java.stream_api.optional_class;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class concept {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Parth", "Laxmi", "John", "Kishor");

        Optional<String> name = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst();

        System.out.println(name.orElse("Not found"));
    }
}
