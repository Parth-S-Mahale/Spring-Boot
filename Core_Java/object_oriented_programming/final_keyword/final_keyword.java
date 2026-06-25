package Core_Java.object_oriented_programming.final_keyword;

// final - variable, method, class

class Calc {

    public void show() {
        System.out.println("By Parth");
    }

    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc {
    public void show() {
        System.out.println("By John");
    }
}

public class final_keyword {
    static void main() {
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);
    }
}
