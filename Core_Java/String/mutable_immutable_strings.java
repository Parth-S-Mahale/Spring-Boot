package Core_Java.String;

public class mutable_immutable_strings {
    public static void main(String[] args) {
        String name = "Parth";
        name = name + " Mahale";
        System.out.println("hello " + name);

        String s1 = "Parth";
        String s2 = "Parth";

        System.out.println(s1 == s2);
    }
}
