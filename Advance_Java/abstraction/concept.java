package Advance_Java.abstraction;

public class concept {
    public static void main(String[] args) {
        Car obj = new updatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }

}

abstract class WagonR extends Car {

    /* public void fly() {
        System.out.println("Flying...");
    } */

    public void drive() {
        System.out.println("Driving...");
    }

}

class updatedWagonR extends WagonR { // concrete class
    public void fly() {
        System.out.println("Flying...");
    }
}