package Advance_Java.exception.throws_keyword;

public class concept {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
            System.out.println("class exist!");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Advance_Java.exception.concept");
    }
}
