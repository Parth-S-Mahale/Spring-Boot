package Advance_Java.interfaces.Need_of_Interfaces;

import java.util.Scanner;

public class intuition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer parth = new Developer();

        System.out.print("Enter the Computer ('desk' OR 'lap') : ");
        String result = sc.next(); // user input

        if (result.equals("desk")) { // if true then Desktop class's code method will be executed
            parth.developerApp(desk);
        } else { // if false then Laptop class's code method will be executed
            parth.developerApp(lap);
        }

    }
}

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {
    public void developerApp(Computer comp) {
        comp.code();
    }
}
