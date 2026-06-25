package Advance_Java.annotations;

public class concept {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}
