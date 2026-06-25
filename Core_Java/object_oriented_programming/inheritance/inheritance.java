package Core_Java.object_oriented_programming.inheritance;

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc  extends  Calc{
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }
}

public class inheritance {
    static void main() {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4,3);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(5,5);
        int r4 = obj.divide(28,4);

        System.out.println("n1 + n2 = " + r1);
        System.out.println("n1 - n2 = " + r2);
        System.out.println("n1 * n2 = " + r3);
        System.out.println("n1 / n2 = " + r4);
    }
}
