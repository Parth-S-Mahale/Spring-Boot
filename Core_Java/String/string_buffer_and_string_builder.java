package Core_Java.String;

public class string_buffer_and_string_builder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Parth"); 

        System.out.println(sb.capacity()); 
        System.out.println(sb.length()); 

        sb.append(" Mahale");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str); 

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(0, "Java ");
        sb.insert(7, "r");
        System.out.println(sb);
        
    }
}
