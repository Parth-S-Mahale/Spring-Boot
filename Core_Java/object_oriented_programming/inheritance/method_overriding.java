package Core_Java.object_oriented_programming.inheritance;

class Phone {
    public int add(int n1, int n2) {
        System.out.println("Calling Phone class add method");
        return n1 + n2;
    }
}

class Mobile extends Phone{
    public int add(int n1, int n2) {
        System.out.println("Calling Mobile class add method");
        return n1 + n2 + 1;
    }
}

public class method_overriding {
    static void main() {
    // Show obj = new Show();
        Mobile obj = new Mobile();
        int result = obj.add(4,3);

        System.out.println(result);
    }
}
