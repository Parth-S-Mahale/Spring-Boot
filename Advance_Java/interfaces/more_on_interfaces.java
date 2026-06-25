package Advance_Java.interfaces;

public class more_on_interfaces {
    public static void main(String[] args) {
        X obj;
        obj = new C();
        obj.show();
        obj.show();

        Y obj1 = new C();
        obj1.run();
    }
}

// --- REMEMBER THIS RELATIONSHIP ---
/* class-class --> extends */
/* class-interface --> implements */
/* interface-interface --> extends */
/* --------------------------------- */

interface X {

    int age = 21; // final and static
    String area = "Mumbai";

    void show();
    void config();
}

interface Y {
    void run();
}

interface Z extends Y{

}

class C implements X, Y, Z {
    public void show() {
        System.out.println("in show...");
    }

    public void config() {
        System.out.println("in config...");
    }

    public void run() {
        System.out.println("in run...");
    }
}

