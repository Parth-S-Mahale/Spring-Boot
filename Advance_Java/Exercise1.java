package Advance_Java;

public class Exercise1 {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        Machine fan = new Fan("Fan");
        Machine wm = new WashingMachine("Washing Machine");

        System.out.println(fan.start());
        System.out.println(wm.start());
    }
}

// TODO: Create an interface called Machine with one method: String start()
interface Machine {
    String start();
}


// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface
abstract class Appliance implements Machine {
    protected String name;

    public Appliance(String name) {
        this.name = name;
    }

    @Override
    public abstract String start();
}

// TODO: Create a class Fan that:
// - Extends Appliance
class Fan extends Appliance {

    public Fan(String name) {
        super(name);
    }

    @Override
    public String start() {
        return name + " is running";
    }
}

// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance {

    public WashingMachine(String name) {
        super(name);
    }

    @Override
    public String start() {
        return name + " is operating";
    }
}

