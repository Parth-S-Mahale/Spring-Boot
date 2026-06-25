package Advance_Java.abstraction;

public class anonymousInnerClass {
    public static void main(String[] args) {
        test obj = new test()
        {
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

class test {
    public void show() {
        System.out.println("in test show");
    }
}