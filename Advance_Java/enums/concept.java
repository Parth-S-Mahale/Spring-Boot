package Advance_Java.enums;

public class concept {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println("Value of s = " + s);
        System.out.println("Index of value of s = " + s.ordinal());

        System.out.println("All the values of enum Status are as follow:");
        Status[] arr = Status.values();
        for (Status ss : arr) {
            System.out.println(ss + " : " + ss.ordinal());
        }
    }
}

enum Status { // class
    Running, Failed, Pending, Success; // objects of the class 'Status'
}
