package Core_Java.String;

public class string {
    public static void main(String[] args) {
        String name = "Parth";
        String strObject = new String("Parth");

        // variable
        System.err.println("string operations for string variable");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" Sanjay Mahale"));

        System.err.println();
        
        // string object
        System.err.println("string operations for string object");
        System.out.println(strObject);
        System.out.println(strObject.hashCode());
        System.out.println(strObject.charAt(1));
        System.out.println(strObject.concat(" Mahale"));
    }    
}
